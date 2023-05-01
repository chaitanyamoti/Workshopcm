import java.util.Scanner;
class Method
{
public static Scanner sc=new Scanner(System.in);
int edge;
void dim()
{
System.out.print("enter the edge of square : ");
this.edge=sc.nextInt();
}
void area()
{
this.dim();
System.out.println("Area of square is :"+(int)Math.pow(edge,2));
}
public static void main(String[] args)
{
Method m=new Method();
m.area();
}
}
	

