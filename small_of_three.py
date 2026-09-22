a = int(input())
b = int(input())
c = int(input())
smallest = a
if b < smallest:
    smallest = b
if c < smallest:
    smallest = c
print("Smallest: ",smallest)