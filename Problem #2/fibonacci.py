count = 0
aux = 0
fib1 = 1
fib2 = 2
while fib1 <= 4000000:
    if fib1 % 2 == 0: 
        count += fib1
    aux = fib1 + fib2
    fib1 = fib2
    fib2 = aux
print(count)