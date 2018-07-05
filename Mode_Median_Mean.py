import numpy as np
from statistics import mode

n = int(input())

list_no = list(map(int,input().split()))

mean = np.mean(list_no)

print(mean)
list_no.sort()
median = np.median(list_no)

print(median)

mode1 = 0;
mode1 = mode(list_no)
# except :
#     mode1 = list_no[0]

print(mode1)