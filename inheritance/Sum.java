class A
{
 private int a;
 private int b;
 void setvalue(int a,int b)
 {
 this.a=a;
 this.b=b;
 }
  int sum()
  { 
  System.out.println("sum is :"+(a+b));
  return a+b;
  }
  }
  class B extends A
  {
   int c;
   void sumAll()
   {
    System.out.println("Sum all is "+(sum()+c));
	}
}
class sum1
{
 public static void main(String args[])
 {
 B ob=new B();
 ob.setvalue(23,44);
 ob.c=30;
 ob.sumAll();
 }
 }
 
  