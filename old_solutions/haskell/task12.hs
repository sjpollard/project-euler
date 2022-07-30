triangular :: Integer -> Integer
triangular n = div (n * (n + 1)) 2

triangleList :: Integer -> [Integer]
triangleList n = map triangular [1..n]

factors :: Integer -> [Integer]
factors n = 1 : [ x | x<-[2..n-1], mod n x == 0]++[n]