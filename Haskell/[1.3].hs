summ 0 = 0
summ n = n + summ (n - 1)

sumAllSin 0 = 0
sumAllSin n = sin (n) + sumAllSin (n - 1)

sumsin n = sin (summ n) / (sumAllSin n)