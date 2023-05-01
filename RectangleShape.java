class RectangleShape
{
          int length,breadth;
          
          RectangleShape(int l, int b)
          {
              length=l;
              breadth=b;
          }
          RectangleShape(int l)
          {
              length=l;
              breadth=10;
           }
          RectangleShape()
          {
             length=50;
             breadth=5;
          }
          float getArea()
          {
             return (length*breadth);
          }           
 }         
 public class FindArea
 {
     public static void main(String args[])
     {
     RectangleShape rs1=new RectangleShape (30);
     RectangleShape rs2=new RectangleShape (12,15);
     RectangleShape rs3=new RectangleShape ();
     
     System.out.println("First Rectangle:" +rs1.getArea());
     System.out.println("second Rectangle:" +rs2.getArea());
     System.out.println("Third Rectangle:" +rs3.getArea());
     }
}
