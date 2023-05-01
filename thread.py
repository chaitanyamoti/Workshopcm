import threading
def add(a,b):
    print("Sum is:{}".format(a+b))
if __name__=="__main__":
    t1=threading.Thread(target=add, args=(10,20))
    t1.start()
    t1.join()
    
def mul(a,b):
    print("multiplication is:{}".format(a*b))
if __name__=="__main__":
    t1=threading.Thread(target=mul, args=(10,4))
    t1.start()
    t1.join()
    
def square(s):
    print("Square is:{}".format(s*s))
if __name__=="__main__":
    t1=threading.Thread(target=square, args=(5,))
    t1.start()
    t1.join()
    print("Done")
