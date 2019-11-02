--
bytwenty :: Int -> Bool
bytwenty a      = all (\x -> (mod a x) == 0) [1..20]