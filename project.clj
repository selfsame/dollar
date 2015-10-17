(defproject selfsame/dollar "0.0.9-SNAPSHOT"
  :description "cljs jquery substitute"
  :url "http://github.com/selfsame/dollar"
  :license {:name "The MIT License (MIT)"
            :url "https://github.com/selfsame/pdf/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojurescript "1.7.122"]]
  :source-paths ["src"]
  :plugins [[lein-cljsbuild "1.1.0"]
            [lein-figwheel "0.4.0"]]
  :clean-targets ^{:protect false} ["resources/public/js/compiled"]

  :cljsbuild {
    :builds [{:id "dev"
              :source-paths ["src"]
              :figwheel {}
              :compiler {:main dollar.bill
                         :asset-path "js/compiled/out"
                         :output-to "resources/public/js/compiled/main.js"
                         :output-dir "resources/public/js/compiled/out"
                         :source-map-timestamp true }}]}
  :figwheel {:load-warninged-code true}
)