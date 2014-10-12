isosc (x1, y1) (x2, y2) (x3, y3)
	| sqrt((x2 - x1)^2 + (y2 - y1)^2) == sqrt((x3 - x1)^2 + (y3 - y1)^2) = True
	| sqrt((x2 - x1)^2 + (y2 - y1)^2) == sqrt((x3 - x2)^2 + (y3 - y2)^2) = True
	| sqrt((x3 - x1)^2 + (y3 - y1)^2) == sqrt((x3 - x2)^2 + (y3 - y2)^2) = True
	| otherwise = False