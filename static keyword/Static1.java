class Demo1
{
 void showMe()
 { 
 System.out.println("DEmo od Static method");
 }
 static void show()
 { 
   showMe();
 }   
}
class Static1
{
 public static void main (String args[])
 {
  Demo1.show();
  }
 }
 