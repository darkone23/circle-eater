(ns circle-eater.util)

(defn loop-with-timer
  [f wait]
    (while true
      (do (f) (Thread/sleep wait))))

(defn print-date [wait]
  (loop-with-timer #(println (java.util.Date.)) wait))

; TODO: write an actual populate implementation
(def populate #(print-date 1000))
