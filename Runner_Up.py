
if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    list_num = list(set(arr))
    list_num.sort()
    print(list_num[len(list_num)-2])
