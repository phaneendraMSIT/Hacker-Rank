def median(numbers: object) -> object:
    # numbers = sorted(numbers)
    center = len(numbers) // 2
    if len(numbers) % 2 == 0:
        return sum(numbers[center - 1:center + 1]) / 2
    else:
        return numbers[center]

n = int(input())
list_quartiles = list(map(int,input().split()))
list_quartiles.sort()
med = median(list_quartiles)
q1 = list_quartiles[ :list_quartiles.index(med)]
q2 = list_quartiles[list_quartiles.index(med)+1: ]
i  = median(q1)
j = median(q2)
print(int(i))
print(med)
print(int(j))

