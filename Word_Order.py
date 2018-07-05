import collections

n = int(input())
Wlist = []
for i in range(n):
    temp = input()
    Wlist.append(temp)

nlist = list(collections.Counter(Wlist).values())

print(*nlist)

import collections

# n = int(input())
# Wlist = []
# for i in range(n):
#     temp = input()
#     Wlist.append(temp)
#
# nlist = list(collections.Counter(Wlist).values())
#
# print(*nlist)
