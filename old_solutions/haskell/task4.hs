palindrome :: String -> Bool
palindrome n      = reverse n == n

cartProd :: [a] -> [a] -> [(a,a)]
cartProd xs ys = [(x,y) | x <- xs, y <- ys]

largestpal :: [(Int, Int)] -> String
largestpal ((x,y):xs)
    | palindrome (show (x*y)) == True = show (x*y)
    | otherwise = largestpal xs