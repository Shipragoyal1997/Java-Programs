class Meth
{
 void show (float n1,double n2)
 {
  System.out.println("float ,double called");
 }
 void show(double n1,float n2)
 {
  System.out.println("double ,float called");
 }
 }
 class DemoMOverLoading
 { 
 public static void main(String args[])
 {
  Meth n=new Meth();
  //n.show(3.3f,4.4f);
  //n.show(4,5);
  n.show(3.3f,4.4);
  n.show(3.3,4.4f);
  }
  }
  
 