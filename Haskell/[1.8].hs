qsort [] = []
qsort (head:tail) = qsort [y | y <- tail, y < head] ++ [head] ++ qsort [y | y <- tail, y >= head]


subCheckDifferent [] = True
subCheckDifferent [x] = True
subCheckDifferent (h:sh:t) = if (h == sh) then False else subCheckDifferent (sh:t) 


checkDifferent (h:t) = subCheckDifferent (qsort (h:t))