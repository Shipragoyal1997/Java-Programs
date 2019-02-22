class Demo
{
 void address()
 {
  System.out.println("------------");
  System.out.println("Rat");
  System.out.println("vikas marg");
  System.out.println("jaipur");
  System.out.println("9660020093");
  System.out.println("-------------");
 }
 void sum(int a,int b)
 { 
  System.out.println("sum of "+a+" and "+b+" is ="+(a+b));
 }
 }
 class FirstProgram
 {
  public static void main(String args[])
  {
   Demo D=new Demo();
   D.address();
   D.sum(2,4);
   }
   }