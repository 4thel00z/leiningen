;; This project is used for leiningen's test suite, so don't change
;; any of these values without updating the relevant tests. If you
;; just want a basic project to work from, generate a new one with
;; "lein new".

(defproject bug "bug"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.flatland/ordered "1.5.6"]])
