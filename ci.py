P=int(input("Enter the principle amount: "))
T=int(input("Enter the time period(yrs): "))
R=float(input("Enter the Rate: "))/100
n=int(input("Enter the  no of times compound interst is applied: "))

print("C.I.= ",P*((1+(R/n))**(n*T)))






