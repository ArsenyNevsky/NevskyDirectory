divis n = [x | x <- [1..(n - 1)], n `rem` x == 0]
sumDiv n = sum [x | x <- [1..(n - 1)], n `rem` x == 0]

-- 
amicables n = [(i, j) | i <- [1..n], j <- [(i + 1)..n], i < j, sumDiv i == j && sumDiv j == i]
