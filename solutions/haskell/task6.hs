sumofsquares = foldr (+) 0 (map (\x -> x*x) [1..100])

squareofsum = (\x -> x*x) (sum [1..100])