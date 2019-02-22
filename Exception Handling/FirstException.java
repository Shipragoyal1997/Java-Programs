import java.util.Scanner;
class FirstException 
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter any no:(non zero)");
  int i=sc.nextInt();
  int a=0;
  try
  {
   a=100/i;
  }
  catch(ArithmeticException e)
  {
   e.printStackTrace();
  }
  System.out.println("value of i is "+i);
  System.out.println("value of a is "+a);
  System.out.println("eop");
  sc.close();
  }
 }
 