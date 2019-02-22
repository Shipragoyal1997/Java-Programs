import java.util.Scanner;
class KBI
{
 public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("enter first no:");
 int i = sc.nextInt();
 System.out.println("enter second no:");
 int j = sc.nextInt();
 int sum=i+j;
 System.out.println(sum);
 sc.close();
  }
}