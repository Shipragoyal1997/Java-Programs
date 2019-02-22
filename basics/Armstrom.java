class Armstrom
{
 public static void main(String args[])
 {
  int i;
  int a;
  int rem;
  for(i=1;i<=5000;i++)
  {
  int x=i;
  while(i!=0)
  {
    rem=i%10;
	i=i/10;
	a= a+(rem*rem*rem);   
   }
   if(a ==x)
   {
   System.out.println(x);  
   }
   }    
 }
}