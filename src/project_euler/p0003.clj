(ns project-euler.p0003)

;; https://projecteuler.net/problem=3

;; The prime factors of 13195 are 5, 7, 13 and 29.

;; What is the largest prime factor of the number 600851475143 ?

;; Simple solution
(defn find-prime-factor
  [x]
  (remove zero?
          (map (fn [a]
                 (if (zero? (mod x a))
                   a 0))
               (range 2 x))))


;; (rest (find-prime-factor 600851475143))

(find-prime-factor 60)