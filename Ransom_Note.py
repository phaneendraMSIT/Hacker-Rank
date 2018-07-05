#!/bin/python3

import math
import os
import random
import re
import sys
import collections


def checkMagazine(magazine, note):
    print(collections.Counter(note))

    return collections.Counter(note) - collections.Counter(magazine) == {}


if __name__ == '__main__':
    mn = input().split()
    m = int(mn[0])
    n = int(mn[1])
    magazine = input().rstrip().split(' ')
    note = input().rstrip().split(' ')
    if checkMagazine(magazine, note):
        print('Yes')
    else:
        print('No')