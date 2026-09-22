n = int(input())
og = n
digits = len(str(n))
sum = 0
while n > 0:
    digit = n % 10
    sum += digit ** digits
    n //= 10
if sum == og:
    print("Armstrong number")
else:
    print("It's not")