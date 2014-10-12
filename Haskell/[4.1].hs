subUpDown head [] 2 = True
subUpDown head [] 1 = False
subUpDown prevHead (nextHead:tail) count | count == -1 = False
										 | (prevHead < nextHead) && count == 1 = subUpDown nextHead tail count
										 | (nextHead < prevHead) && count == 1 = subUpDown nextHead tail 2
										 | (nextHead < prevHead) && count == 2 = subUpDown nextHead tail count
										 | otherwise = False

upDown [] = False
upDown [x] = False
upDown (head:shead:tail) = 
	if head < shead 
		then subUpDown shead tail 1 
		else subUpDown shead tail (-1)