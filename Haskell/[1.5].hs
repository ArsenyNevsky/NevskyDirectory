-- The previous code doesn't work. I chose -99999999 as a minimum for empty list
subminlist [] acc = acc
subminlist (h:t) acc = 
	if (h <= acc) then subminlist t h else subminlist t acc

minlist [] = -99999999
minlist (head:tail) = 
	subminlist (head:tail) head	