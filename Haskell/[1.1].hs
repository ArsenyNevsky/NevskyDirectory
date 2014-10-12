-- f 3 Должно получиться 1+1/(1+1/(1+1/1)), то есть 1.6666.. 
subb 0 count = count
subb n count = count + 1/(subb (n - 1) (count + 1))


b 0 = 0
b n = subb n 0