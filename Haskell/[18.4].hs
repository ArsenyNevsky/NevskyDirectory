-- superMap (\x -> [x*x, 100*x]) [1,2,3] =>  [1, 100, 4, 200, 9, 300]
superMap f [] = []
superMap f (h:t) = f h ++ superMap f t