class Demo
{
 void sum (int a,int b)
 {
 System.out.println("sum is "+(a+b));
 }
 int sum(int a,int b,int c)
 {
  return (a+b+c);
  }
  double sum(double a ,double b,double c)
  { 
   return (a+b+c);
   }
  }
  class Show 
  {
  public static void main(String args[])
  {
   Demo d=new Demo();
   d.sum(8,9);
   int i=d.sum(8,6,9);
   System.out.println(i);
   }
   }