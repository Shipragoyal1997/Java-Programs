class DemoPrime
{
 public static void main(String args[])
 {
  int n=16;
  int i;
  int flag=0;
  for(i=2;i<n;i++)
  {
   if(n%i==0)
   {
    flag++;
    }
   }
   if(flag==0)
   System.out.println("no. is not prime");
   else
   System.out.println("no. is prime");
  }
 }