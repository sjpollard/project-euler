fiblist :: Int -> [Int]
fiblist i           = if fib i <= 4000000
                        then (fib i):fiblist (i + 1)
                        else []


fib :: Int -> Int
fib 0      = 0
fib 1      = 1
fib n      = fib (n - 1) + fib (n - 2)