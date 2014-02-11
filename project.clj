(defproject matchcolor "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-cljsbuild "1.0.2"]]
  :cljsbuild
    {:builds
     [{:source-paths ["src"],
       :compiler
       {:pretty-print false, :target :nodejs, :optimizations :simple}}]}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2156"]
                 [garden "1.1.5"]
                 [hiccups "0.3.0"]])
