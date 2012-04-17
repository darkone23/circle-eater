(ns circle-eater.core
  (:use [circle-eater.util :only (populate)]
        [compojure.core]
        [ring.adapter.jetty])
  (:require [circle-eater.views :as views]
            [compojure.handler :as handler])
  (:gen-class))

(defroutes circle-routes 
  views/home
  views/random-json-endpoint
  views/public
  views/not-found)

(def app 
  (handler/site circle-routes))

(defn -main [& args]
  (do
    (run-jetty app {:port 4000 :join? false})
    (populate)))
