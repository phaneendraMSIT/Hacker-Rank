#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the whatFlavors function below.
def whatFlavors(cost, money):
    for i in cost:
        for j in cost:
            if i + j == money:
                print(cost.index(i) + ' ' + cost.index(j))


if __name__ == '__main__':
    t = int(input())

    for t_itr in range(t):
        money = int(input())

        n = int(input())

        cost = list(map(int, input().rstrip().split()))

        whatFlavors(cost, money)