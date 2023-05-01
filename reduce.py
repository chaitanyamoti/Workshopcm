from functools import reduce

list1 = [1,2,3]
num = reduce(lambda x,y:x*y, list1)
# num = 0
# for i in list1:
#     num = num + i
print(num)
