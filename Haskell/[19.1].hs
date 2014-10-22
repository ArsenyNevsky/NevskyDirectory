digits n = if q == 0 then [r] else digits q ++ [r]
  where (q, r) = n `divMod` 10