countOdd list = foldr (\x z -> if x `mod` 2 == 1 then z+1 else z) 0 list
countOdd1 list = length (filter (\y -> y `mod` 2 /= 0) list)