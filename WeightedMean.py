n = int(input())

x = list(map(int,input().split()))
w = list(map(int,input().split()))


def mean(x,w,n):
    sumno = 0
    for i in range(0,n,1):
        sumno = sumno +(x[i]*w[i])


    Wmean = sumno/sum(w)
    print( round(Wmean,1))


if len(x) == len(w) == n:
    mean(x,w,n)