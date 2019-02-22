class Demo
{
 static int num=300;
 int a=100;
}
class Static 
{
 public static void main (String args[])
 {
  System.out.println(Demo.num);
  Demo d=new Demo();
  d.a=-1;
  d.num=-1;
  Demo d1=new Demo();
  System.out.println(d1.a);
  System.out.println(Demo.num);
  }
 }
 