class Demo
{
  static 
  {
   System.out.println("static block called!");
   }
   Demo()
   {
   System.out.println("constructor called!");
   }
   void  show ()
   {
    System.out.println("show called!");
	}
	{
	System.out.println("initialization block called");
	}
   }
 class DemoSB
 {
  static
  {
   System.out.println("static block1 called!");
   }
   public static void main(String args[])
   {
    System.out.println("main called");
	Demo d=new Demo();
	System.out.println("---------------");
	Demo d1=new Demo();
	}
	static 
	{
	 System.out.println("static block2 called");
	 }
	 }
	 
  
   
 
 