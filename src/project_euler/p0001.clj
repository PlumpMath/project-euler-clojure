(ns project-euler.p0001)

;; https://projecteuler.net/problem=1
;;
;; Multiples of 3 and 5
;; Problem 1

;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

;; Find the sum of all the multiples of 3 or 5 below 1000.

;;;; Simplest solution
(defn is-multiples-of-3-or-5?
  [x]
  (if (or (zero? (mod x 3))
          (zero? (mod x 5)))
    x 0))

(reduce + (map is-multiples-of-3-or-5? (range 1 1000)))
;; => 233168


;;; More optimize method
(-
 (+ (reduce + (range 3 1000 3))
    (reduce + (range 5 1000 5)))
 (reduce + (range 15 1000 15)))
;; => 233168
