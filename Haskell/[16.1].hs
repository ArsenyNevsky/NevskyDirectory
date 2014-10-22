cantor =
	let res = [x | x <- [1..]]
	in concat(concat (map (\i -> (let y = [1..(i - 1)] in [(i, i)] : [[(j, i), (i, j)] | j <- [1..(i - 1)]])) [i | i <- [1..]]))