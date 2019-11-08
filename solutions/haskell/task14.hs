collatz :: Int -> Int -> Int -> (Int,Int)
collatz a 1 x = (a,x)
collatz a n x 
    | even n = collatz a (div n 2) (x+1)
    | odd n = collatz  a (3*n + 1) (x+1)