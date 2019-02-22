class DemoInt 
{
 static int a;
 int b;
 
 static 
 {
  a=100;
  System.out.println("static block called");
 }
 
 {
 b=200;
 System.out.println("initialization block caalled");
 }
  
 DemoInt()
{
 System.out.println("constructor called");
}
 void show()
{
 System.out.println("method called");
 }
 }
  
 class MainInt
 {
  public static void main(String args[])
  {
   DemoInt i=new DemoInt();
   i.show();
   System.out.println("----------------");
   DemoInt j=new DemoInt();
   j.show();
   }
  }