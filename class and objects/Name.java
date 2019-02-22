class Demo
{
String getname (String firstname ,String lastname)
{
 return firstname+ lastname;
 }
 boolean check(double a,double b)
 {
  if (a>b)
  return true;
  else 
  return false;
 }
 }
 class Name 
 {
  public static void main(String args[])
  {
   Demo d=new Demo();
   String name =d.getname("shipra "," goyal");
   System.out.println("name is :"+name );
   boolean x=d.check(4,3);
   System.out.println(x);
}
}   