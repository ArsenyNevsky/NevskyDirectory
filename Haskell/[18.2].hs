getWeekend list
	| length list < 7 = []
	| otherwise       = 
		let x = take 7 list in ((list !! 5) + (list !! 6)) : getWeekend (drop 7 list)

weekendExpences list = sum (getWeekend list)