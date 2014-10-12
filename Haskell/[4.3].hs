checkUpDown2 [] [] = True
checkUpDown2 [x] [y] = True
checkUpDown2 (h1:t1) (h2:t2)
	| h1 < head t1 && h2 > head t2 = checkUpDown2 t1 t2
	| otherwise = False

subUpDown2 [] l1 l2 = (l1, l2)
subUpDown2 l1 l2 l3
	| head l1 < last l1 = subUpDown2 (init(tail l1)) (l2 ++ [head l1]) ([last l1] ++ l3)
	| head l1 > last l1 = subUpDown2 (init(tail l1)) (l2 ++ [last l1]) ([head l1] ++ l3)
	| head l1 == last l1 = subUpDown2 (init(tail l1)) (l2 ++ [head l1]) ([last l1] ++ l3)

upDown2 [] = ([])
upDown2 list
	| (length list) `mod` 2 == 0 = subUpDown2 (init (tail list)) ([head list]) ([last list])
	| otherwise = ([], [])