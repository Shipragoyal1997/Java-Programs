class Demo2
{
 int a=100;
 static void show()
 {
  System.out.println(this.a);
  }
}
class Static2
{
 public static void main (String args[])
 {
  Demo2.show();
  }
 }
 