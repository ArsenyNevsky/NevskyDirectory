fun 0 k = [[]]

fun n k = [(x:xs) | x <- [1..(k + 1)], xs <- fun (n - 1) k]

generalizedCantor n = concat (map (\x -> filter (\xs -> sum xs == (x + n)) (fun n x)) [0..])