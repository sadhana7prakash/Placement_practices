n = int(input())
rev = 0
while n > 0:
    digits = n % 10
    rev = rev * 10 + digits
    n //= 10
print(rev)