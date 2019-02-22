class A
{
 A()
 {
  System.out.println("class A is Called");
 }
 class B extends A
 {
  B()
  {
   System.out.println("class B is called");
  }
 }
 class c extends B
 {
  C()
  {
   System.out.println("class c is called");
   }
  }
  class Calling 
  {
  public static void main(String args [])
  {
   new c();
   }
   }
   