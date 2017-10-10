import math

primefactors = []
number = 600851475143

# I couldn't implement the Sieve of Eratosthenes algorithm
# so I tried a different approach

# first we cross of all the even numbers, since they can be
# divided by two
while number % 2 == 0:
        primefactors.append(2)
        n //= 2

# then we try the odd numbers
# up to sqrt of the number + 1
maximum = math.sqrt(number+1)
odds = 3
while odds <= maximum:
        if number % odds == 0:
                primefactors.append(odds)
                number //= odds
        else:
                odds += 2

print(max(primefactors))
