n = int(input())
square = n * n
sum = 0
while square > 0:
    sum += square % 10
    square //= 10
if sum == n:
    print("Neon number")
else:
    print("Not a neon number")