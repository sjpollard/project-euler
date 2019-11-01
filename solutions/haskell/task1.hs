sumofmult :: Int -> Int
sumofmult n = sum (filter divby3or5 [1..n])

divby3or5 :: Int -> Bool
divby3or5 n      = if mod n 3 == 0 || mod n 5 == 0
                   then True
                   else False
