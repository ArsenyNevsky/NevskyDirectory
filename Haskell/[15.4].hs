data Tree = Empty | Node Integer Tree Tree

foldTree f e Empty = e
foldTree f e (Node v l r) = f v (foldTree f e l) (foldTree f e r)

sumPos = foldTree (\v l r -> (if v <= 0 then 0 else v) + l + r) 0