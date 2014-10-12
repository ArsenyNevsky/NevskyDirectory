data Tree = Empty |  Node Integer Tree Tree deriving (Eq, Show)

foldTree = foldl

myfold Empty list = []
myfold (Node value l r) list = list ++ [value] ++ myfold l list ++ myfold r list

bintree = 
	Node 1 
	(Node 2 (Node 4 Empty Empty) (Node 5 Empty Empty)) 
	(Node 3 (Node 6 Empty Empty) (Node 7 Empty Empty))

test =
	let list = myfold bintree []
	in foldTree (+) 0 list