collatz :: Int -> Int -> Int
collatz 1 x = x
collatz n x 
    | even n = collatz (div n 2) (x+1)
    | odd n = collatz (3*n + 1) (x+1)

main :: IO () -> ()
main = do
        let a = map (\x->collatz x 1) [1..999999]
        let b = maximum a
        c <- fromMaybe (findIndex (==b) a)
        print c