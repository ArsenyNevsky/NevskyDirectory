createList 0 list = list
createList n list = (createList (n - 1) list) ++ [n]

createTable n m list template
	| n + 1 == m  = tail(list)
	| otherwise   = createTable n (m + 1) (list ++ [newList]) template
	where newList = map (*m) template

multTable n = createTable n 1 [[]] (createList n [])