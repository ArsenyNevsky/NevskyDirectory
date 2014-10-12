myMod x y
	| x `mod` y == 0 = True
	| otherwise      = False

isContainsList _ _ [] = True
isContainsList len n (h:t)
	| len == n   = isContainsList len 1 t
	| h < head t = isContainsList len (n + 1) t
	| otherwise  = False

subParts len indLenSubL list
	| indLenSubL > len = False
	| myMod len indLenSubL == True && isContainsList indLenSubL 1 list == True  = True
	| mymod len indLenSubL == True && isContainsList indLenSubL 1 list == False = subParts len (indLenSubL + 1) list
	| otherwise                                                                 = subParts len (indLenSubL + 1) list

parts [] = False
parts list = subParts (length list) 2 list