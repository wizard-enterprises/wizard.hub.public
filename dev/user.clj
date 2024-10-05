(ns user
  (:use wizard.toolbelt)
  (:require [kaocha [repl :as k] [watch :as w]]
            wizard.contextually))

(comment
  ;; run tests once
  (k/run :unit)
  ;; run tests in watch mode
  (w/run (k/config)))
