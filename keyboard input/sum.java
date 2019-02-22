import java.util.Scanner;
class Sum
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  int m1[][]=new int[3][3];
  int m2[][]=new int[3][3];
  //storing values into m1
  
 for(int i=0;i<3;i++)
 {
  for(int j=0;j<3;j++)
  {
   System.out.println("enter values: for m1["+i+"]["
   +j+"]:");
   m1[i][j]=sc.nextInt();
   }
  System.out.println();
  }
  for(int i=0;i<3;i++)
 {
  for(int j=0;j<3;j++)
  {
   System.out.print(m1[i][j]);
   
   }
  System.out.println();
  }
 }
 }
 