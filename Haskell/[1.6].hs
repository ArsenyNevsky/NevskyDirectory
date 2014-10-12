subminsum [] min = min
subminsum (h:sh:t) min = if (h + sh) < min then subminsum (sh:t) (h + sh) else subminsum (sh:t) min
subminsum [x] min = min


minsum [] = -999999999
minsum (h:sh:t) = subminsum (sh:t) (h + sh)