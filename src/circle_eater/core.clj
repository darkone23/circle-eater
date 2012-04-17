(ns circle-eater.core
  (:use compojure.core)
  (:use ring.adapter.jetty)
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

(defn loop-with-timer
  [f wait]
    (while true
      (do (f) (Thread/sleep wait))))

(defn print-date [wait]
  (loop-with-timer #(println (java.util.Date.)) wait))

; TODO: write an actual populate implementation
(def populate #(print-date 1000))

(defn -main [& args]
  (do
    (run-jetty app {:port 4000 :join? false})
    (populate)))
