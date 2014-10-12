-- In the previous version of sending i incorrect wrote a name of function minsums instead of minsum.
minsum list = minimum(map (\(x, y) -> x + y) (zip list (tail list)))