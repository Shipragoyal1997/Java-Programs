class Demo
{ 
 int a=10;
 int b=20;
 }
 class Sum
 {
  public static void main(String args[])
  {
   Demo d=new Demo();
   System.out.println(d);
   System.out.println(d.a);
   System.out.println(d.b);
   Demo d1=new Demo();
   d1.a=200;
   d1.b=2;
   System.out.println(d1);
   System.out.println(d1.a);
   System.out.println(d1.b);
  }
 }