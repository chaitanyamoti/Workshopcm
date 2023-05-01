import mysql.connector
mydb=mysql.connector.connect(
     host="local",
     user="abc",
     password="123/"
)
print(mydb)
