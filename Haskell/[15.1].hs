sumDiv n = sum [x | x <- [1..(n - 1)], n `rem` x == 0]

perfects n = [x | x <- [1..n], sumDiv x == x]