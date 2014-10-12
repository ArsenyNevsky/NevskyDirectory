data Tree = Empty |  Node Integer Tree Tree deriving Show

printHeightTree Empty = 0
printHeightTree (Node val l r) = 1 + max (printHeightTree l) (printHeightTree r)

height (Node val l r) = (printHeightTree (Node val l r)) - 1 