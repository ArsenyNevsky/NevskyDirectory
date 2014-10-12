data Candy = Cake [Char] Integer | Sweets [Char] Integer Integer deriving (Eq, Show)

totalPrice :: [Candy] -> Integer -> Integer
totalPrice [] result = result
totalPrice (h:t) result =
	case h of
		Cake name price          -> totalPrice t (result + price)
		Sweets name price weight -> totalPrice t (result + (price * weight))

total = totalPrice [(Cake "aa" 876), (Sweets "bb" 2 50), (Sweets "cc" 2 12)] 0
test = total