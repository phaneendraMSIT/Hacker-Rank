def merge(n,element, frequency):
    mixlist = []
    for i in range(0,n,1):
        temp = []
        # m = frequency[i]
        for j in range(0,frequency[i],1):
            temp  = element[i]
        mixlist.append(temp)
    print(mixlist)
    return mixlist

n = int(input())
element = list(map(int, input().split(' '))).sort()
frequency = list(map(int,input().split(' '))).sort()

mergelist = merge(n,element,frequency)

