class OverloadDemo
{
      void area(float x)
      {
            System.out.println("the area of square is"+Math.pow(x,2)+" sq units");
      }
      void area(float x,float y)
      {
            System.out.println("the area of the rectangle is "+x*y+" sq units");
      }
          
 
}
class Overload
{
       public static void main(String args[])
       {
             OverloadDemo ob=new OverloadDemo();
             ob.area(5);
             ob.area(25,10);
             ob.area(23);
             }
}
