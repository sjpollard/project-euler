primeSieve :: [Int] -> [Int]
primeSieve []       = []
primeSieve (x:[])   = [x]
primeSieve (x:xs)   = x : primeSieve(filter (\a -> mod a x /= 0) xs)