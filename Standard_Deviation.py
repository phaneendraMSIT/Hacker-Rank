n = int(input())
s = list(map(int, input().split()))
mean = sum(s) // n
suml = 0
for i in s:
    suml = suml + ((i - mean) ** 2)
print(round((suml/n)**0.5), 1)