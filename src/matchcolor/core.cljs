(ns matchcolor.core
  (:require [cljs.nodejs :as nodejs]
            [matchcolor.colorsimilarity :as colorsimilarity]
            [matchcolor.views :as views]
            [garden.color :as color :refer [hsl rgb]]))

; Node.js dirname
(def __dirname (js* "__dirname"))

(def express (nodejs/require "express"))
(def logfmt (nodejs/require "logfmt"))

(def app (express))

(def port (or (aget nodejs/process "env" "PORT") 3000))

; Logger
(.use app (.requestLogger logfmt))

; Body parser
(.use app (.urlencoded express))
(.use app (.json express))


; Set assets folder
(.use app (.static express (str __dirname "/../assets")))

(.get app "/" #(.send %2 (views/layout-render views/home "Home")))

; Redirect form to to /MYHEXCOLOR
(.post app "/" #(.redirect %2 (str "/" (aget %1 "body" "color"))))

(.get app "/about" #(.send %2 (views/layout-render views/about "About")))

(.get app
      "/:color"
      #(.send %2
              (let [hexcolor (aget %1 "params" "color")]
                (if (color/hex? hexcolor)
                  (views/layout-render (views/color (colorsimilarity/likely-color hexcolor)) "Color")
                  (views/layout-render views/invalid-color "Home")))))

(.get app "*" #(.send %2 (views/layout-render views/four-oh-four "404") 404))

(defn -main [& args]
  (.listen app port))

(set! *main-cli-fn* -main)
