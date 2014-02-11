(ns matchcolor.views
  (:require [hiccups.runtime :as hiccupsrt]))

(def site-name "MatchColor")

(defn nav [active]
  (let [homeactive (if (= active "Home") :li.active :li)
       aboutactive (if (= active "About") :li.active :li)]
    [:ul.nav.masthead-nav
      [homeactive [:a {:href "/"} "Home"]]
      [aboutactive [:a {:href "/about"} "About"]]]))

(def home
  [:div.inner.cover
    [:h1.cover-heading "Pick a color."]
     [:form.form-inline
      {:role "form" :action "" :method "post"}
      [:div.form-group
       [:label.sr-only {:for "color"} "Color"]
       [:input#color
        {:class "form-control color" :type "text" :name "color"}]]
      [:button.btn.btn-default {:type "submit"} "Go"]]])

(def about
  [:div.inner.cover
       [:h1.cover-heading "About"]
       [:p.lead
        "An experiment in building a server-side web application in ClojureScript that also does something relatively useful: Find the name of a hexcolor."]])

(def four-oh-four
  [:div.inner.cover
       [:h1.cover-heading "Page not found"]
       [:p.lead
        "Didn't find that page. Sorry."]])

(def invalid-color
  [:div.inner.cover
       [:h1.cover-heading "Not a valid color!"]
       [:p.lead
        "Try again!"]])

(defn color [hsh]
  [:div.inner.cover [:h1.cover-heading "Found it!"]
    [:div.row
      [:div.col-md-4
       [:h2 {:style (str "color:" (get hsh :initcol) ";")}
        (str "Your Color: " (get hsh :initcol))]]
      [:div.col-md-4
       [:h2 {:style (str "color:" (get hsh :foundcol) ";")}
        (str "Closest Match: " (get hsh :name) " (" (get hsh :foundcol) ")")]]
      [:div.col-md-4
       [:h2
         (str "Color Distance: " (get hsh :colordistance))]]]])

(defn layout [layout-partial active]
  [:html
  {:lang "en"}
  [:head
   [:meta {:charset "utf-8"}]
   [:meta {:content "IE=edge", :http-equiv "X-UA-Compatible"}]
   [:meta
    {:content "width=device-width, initial-scale=1", :name "viewport"}]
   [:meta {:content "", :name "description"}]
   [:meta {:content "", :name "author"}]
   [:link {:href "/img/favicon.ico", :rel "shortcut icon"}]
   [:title (str site-name " - " active)]
   "<!-- Bootstrap core CSS -->"
   [:link
    {:rel "stylesheet", :href "/css/bootstrap.min.css"}]
   "<!-- Custom styles for this template -->"
   [:link {:rel "stylesheet", :href "/css/cover.css"}]
   "<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->"
   "<!--[if lt IE 9]>\n      <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n      <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n    <![endif]-->"]
  [:body
   [:a
    {:href "https://github.com/seabre/matchcolor"}
    [:img
     {:style "position: absolute; top: 0; left: 0; border: 0;",
      :src
      "https://s3.amazonaws.com/github/ribbons/forkme_left_gray_6d6d6d.png",
      :alt "Fork me on GitHub"}]]
   [:div.site-wrapper
    [:div.site-wrapper-inner
     [:div.cover-container
      [:div.masthead.clearfix
       [:div.inner
        [:h3.masthead-brand site-name]
        (nav active)]]
      layout-partial
      [:div.mastfoot
       [:div.inner
        [:p
         "ClojureScript goodness provided by "
         [:a {:href "http://about.me/seabre"} "seabre"]]]]]]]
   "<!-- Bootstrap core JavaScript\n    ================================================== -->"
   "<!-- Placed at the end of the document so the pages load faster -->"
   [:script {:src "https://code.jquery.com/jquery-1.10.2.min.js"}]
   [:script {:src "/js/jscolor.js"}]
   [:script {:src "/js/bootstrap.min.js"}]
   [:script {:src "/js/docs.min.js"}]]])

; Hiccups was really only meant for client side, so it doesn't actually render doctypes.
; This is a not awesome workaround, but it works.
(defn layout-render [layout-partial active]
  (str "<!DOCTYPE html>" (hiccupsrt/render-html (layout layout-partial active))))
