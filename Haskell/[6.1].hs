multMatrix mA q =
	let
		mQ = [0, 1, 1, (-q)]
		a = (mA !! 0) * (mQ !! 0) + (mA !! 1) * (mQ !! 2)
		b = (mA !! 0) * (mQ !! 1) + (mA !! 1) * (mQ !! 3)
		c = (mA !! 2) * (mQ !! 0) + (mA !! 3) * (mQ !! 2)
		d = (mA !! 2) * (mQ !! 1) + (mA !! 3) * (mQ !! 3)
	in [a, b, c, d]


subeuclid a b e
	| a `mod` b == 0 = (e !! 1, e !! 3)
	| otherwise = subeuclid b (a `mod` b) newE 
		where newE = multMatrix e ((a - (a `mod` b)) `div` b)


euclid a b
	| gcd a b == 1 = subeuclid a b [1, 0, 0, 1]
	| otherwise = ((-1), (-1))