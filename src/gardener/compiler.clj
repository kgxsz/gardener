(ns gardener.compiler
  (:require [garden.core :as garden]
            [juxt.dirwatch :as dirwatch]))


(defn reload-stylesheet
  [stylesheet]
  (require (symbol (namespace stylesheet)) :reload-all))


(defn compile-stylesheet
  [stylesheet options]
  (garden/css options (deref (resolve stylesheet))))


(defn -main
  [& {:strs [--stylesheet --output-to --watch --pretty-print --build-once]}]
  (let [stylesheet (symbol --stylesheet)
        options {:output-to --output-to
                 :pretty-print? (Boolean/valueOf --pretty-print)}]

    (reload-stylesheet stylesheet)
    (compile-stylesheet stylesheet options)

    (when-not (Boolean/valueOf --build-once)
      (dirwatch/watch-dir
       (fn [_]
         (reload-stylesheet stylesheet)
         (compile-stylesheet stylesheet options))
       (clojure.java.io/file --watch))
      (deref (promise)))))
