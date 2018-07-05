def merge_the_tools(string, k,) :
    n = len(string)//k
    list_string=[]
    while string:
        list_string.append(string[:n])
        string = string[n:]
    for word in list_string:
        print(set(list(word)))


if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)