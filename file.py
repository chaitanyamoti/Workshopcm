file=open('file.txt','w')
file.write("Python\n")
file.write("Program")
file.close()
file=open('file.txt','r')
print(file.read())

file=open('file1.txt','w')
file.write("This is Python Code\n")
file.write("Syntax is easy in python")
file.close()
file=open('file1.txt','r')
print(file.read())


