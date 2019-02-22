class A
{ 
 int a=(int)(Math.random()*10);
 int b=(int)(Math.random()*10);
 }
 class B
 {
  int a=40;
  int b=50;
 }
 class First
 {
  public static void main(String args[])
  {
   A i=new A();
   B j=new B();
   System.out.println(i.a+"+"+i.b+"="+(i.a+i.b));
   System.out.println(j.a+"+"+j.b+"="+(j.a+j.b));
   }
 }