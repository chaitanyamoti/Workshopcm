class Overload{

void square(int x){
System.out.println("area of square=" + x*x);
}
void rectangle(int l,int b){
System.out.println("area of rectangle=" + l*b);
}
}
class Over{
public static void main(String[] args){
   Overload b=new Overload();
   b.square(4);
   b.rectangle(2,4);
   }
   }
