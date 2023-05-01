class Rect {
 int a,b;
  void dim(int a,int b){
  this.a=a;
  this.b=b;
  }
  
  void area(){
  System.out.println("area of reactangle is:"+this.a*this.b);
  }
  public static void main (String args[]){
  Rect l=new Rect();
  l.dim(5,6);
  l.area();
  }
  }
