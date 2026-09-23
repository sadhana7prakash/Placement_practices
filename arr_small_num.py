n = int(input())
a = list(map(int, input.split()))
average = sum(a) / n
count = 0
for i in range(n):
    if a[i] < average:
        count += 1
print(count)