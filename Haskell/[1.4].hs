subfact 0 acc = acc
subfact n acc = subfact (n - 1) (acc * n)

fact n = subfact n 1


subsumfact 0 acc = acc - 1
subsumfact n acc = subsumfact (n - 1) (acc + fact (n - 1)) 

sumfact 0 = 1
sumfact n = subsumfact (n + 1) 0