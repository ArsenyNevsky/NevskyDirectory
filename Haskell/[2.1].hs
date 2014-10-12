divForParam n = [x | x <- [1..(n - 1)], rem n x == 0]

listPrimesCounts count = [n | n <- [1..count], n < count, isPrime n]
         where isPrime x = (divForParam x == [1])

-- le is the last elem of list
subG count le [] = False
subG count le list =
	if le + (head list) > count 
		then subG count (last (tail list)) (tail list)
        else 
			if le + (head list) < count 
				then subG count le (tail list) 
				else 
					if le + (head list) == count 
						then True
						else False

g count = 
	let le = last (listPrimesCounts count)
	in subG count le l where l = listPrimesCounts count
