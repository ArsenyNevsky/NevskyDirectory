binVector1 n = take n (repeat 1)

binVector2 2 = [1,1]
binVector2 n = [1] ++ take (n - 2) (repeat 0) ++ [1]

subframe n k res
	| k+1 == n = subframe n (k - 1) (res ++ [(binVector1 n)])
	| k == 0 = res ++ [(binVector1 n)]
	| otherwise = subframe n (k - 1) (res ++ [(binVector2 n)])

frame n = subframe n (n - 1) []