# author: code_king
# time: 2023/5/12 14:21
# file: mt01.py
# import math
# sc=input()
# a=int(sc.split()[0])
# b=int(sc.split()[1])
# sum=a
# temp=a
# for i in range(1,b):
#     temp=math.sqrt(temp)
#     sum=sum+temp
# sum=round(sum,2)
# print(sum)

T=int(input())
for i in range(T):
    a,b=map(int,input().split())
    a_str=str(a)
    n=len(a_str)
    insert_pos=n
    for j in range(n):
        if int(a_str[j])<=b:
            insert_pos=j
            break
    max_num=int(a_str[:insert_pos]+str(b)+a_str[insert_pos:])
    print(max_num)

# T=int(input())
# for _ in range(T):
#     a,b=input().split()
#     for i in range(len(a)):
#         if a[i]<b:
#             a=a[:i]+b+a[i:]
#             break
#         else:
#             a+=b
#     print(a)