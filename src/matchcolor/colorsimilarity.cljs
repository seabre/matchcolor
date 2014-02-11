(ns matchcolor.colorsimilarity
  (:require [matchcolor.colors :as colorlist]
            [garden.color :as color :refer [hsl rgb]]))

; sqrt((r-r1)^2+(g-g1)^2+(b-b1)^2)
(defn color-distance [c1 c2]
  (Math/sqrt (+ (Math/pow (- (get c2 :r) (get c1 :r)) 2)
                (Math/pow (- (get c2 :g) (get c1 :g)) 2)
                (Math/pow (- (get c2 :b) (get c1 :b)) 2))))


(defn- merge-with-result [distance init found]
  (let [foundr (get found :r)
        foundg (get found :g)
        foundb (get found :b)]
  {:colordistance distance :initcol (color/rgb->hex init) :foundcol (color/rgb->hex {:red foundr :green foundg :blue foundb})}))

(defn likely-color [c]
  (let [initcol (color/hex->rgb c)
        initrgb {:r (get initcol :red) :g (get initcol :green) :b (get initcol :blue)}]
    (loop [idx 0
           nextcolordistance (color-distance initrgb (nth colorlist/colors idx))
           bestcolordistance nextcolordistance
           closestcolor 0]
      (if (= idx (- (count colorlist/colors) 1))
         (if (< nextcolordistance bestcolordistance)
           (merge (nth colorlist/colors idx) (merge-with-result nextcolordistance initcol (nth colorlist/colors idx)))
           (merge (nth colorlist/colors closestcolor) (merge-with-result bestcolordistance initcol (nth colorlist/colors closestcolor))))
         (if (< nextcolordistance bestcolordistance)
           (recur (+ idx 1) (color-distance initrgb (nth colorlist/colors (+ idx 1))) nextcolordistance idx)
           (recur (+ idx 1) (color-distance initrgb (nth colorlist/colors (+ idx 1))) bestcolordistance closestcolor))))))
