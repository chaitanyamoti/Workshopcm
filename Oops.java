class Oops{

void area(int x){
System.out.println("area of square=" + x*x);
}}
class Override{
void area(int l,int b){
System.out.println("area of rectangle=" + l*b);
}
}
class Over{
public static void main(String[] args){
   Overload b=new Overload();
   Override c=new  Override();
   b.area(4);
   c.area(2,4);
   }
   }
