class  Shape{
     int s=2;
     int l=2;
     int b=3;
     
     public void main(String [] args){
     
  
         Square c=new Square();
         Rectangle r=new Rectangle();
   
     
         c.Area();
         r.Area();
   }
   }
      class Square extends Shape{
         public void Area(){
          int area=s*s;
          System.out.println(area);
     }
     }
      class  Rectangle extends Shape{
           public void Area(){
          int area=l*b;
           System.out.println(area);
           }
     
     
    
           
  
   }
   
   
   
