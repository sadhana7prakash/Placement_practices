arr = list(map(int, input("Enter elements: ").split()))

sum = 0

for i in range(0, len(arr), 2):
    sum = sum + arr[i]

print("Sum:", sum)