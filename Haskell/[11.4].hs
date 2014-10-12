coins n = [[(div z 2), l, m] | l <- [0..(div n 3)], m <- [0..(div n 5)], let z = n - 3 * l - 5 * m, z >= 0, mod z 2 == 0]
