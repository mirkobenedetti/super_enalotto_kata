
(use '[clojure.string :only (join)])

(defn getNumbers [n] (map #(if(< % 10) (str "0" %) %) (sort (take 6 (distinct (repeatedly #(+ (rand-int n) 1)))))))

(println (join " - " (getNumbers 90)))