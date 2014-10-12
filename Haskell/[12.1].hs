allLists n k
	| k > 0     = [(h:t) | h <- [1..n], t <- allLists n (k - 1)]
	| otherwise = [[]]