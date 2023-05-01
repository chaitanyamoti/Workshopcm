class Rect
{
int l, b;
void dim(int l, int b)
{
this.l=l;
this.b=b;
}
void area()
{
System.out.println("Area of rectangle is :"+this.l*this.b);
}
public static void main(String args[])
{
Rect a=new Rect();
a.dim(4, 5);
a.area();
}
}
