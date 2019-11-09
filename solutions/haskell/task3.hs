primeFactors :: Integer -> Integer -> [Integer]
primeFactors n i
    | n == 1 = []
    | i == 1 = []++primeFactors n (i+1)
    | mod n i == 0 = [i]++primeFactors (div n i) i
    | otherwise = []++primeFactors n (i+1)
    