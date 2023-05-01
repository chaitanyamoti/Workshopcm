def prime(num):
  if num == 1:
    print(num, "is not a prime number")
  elif num > 1:
   # check for factors
     for i in range(2,num):
       if (num % i) == 0:
           print(num,"is not a prime number")
           print(i,"times",num//i,"is",num)
           break
     else:
       print(num,"is a prime number")
  else:
   print(num,"is not a prime number")
num=int (input ("Enter any number to test whether it is odd or even: "))
prime(num)
