class SimpleIfElse
{
 public static void main(String args[])
 {
  int i=(int)(Math.random()*100);
  int j=(int)(Math.random()*100);
  int k=(int)(Math.random()*100);
  System.out.println(i+","+j+","+k);
  if((i>j)&&(i>k))
  {
   System.out.println("i is greater");
   }
   else if((j>i)&&(j>k))
   {
    System.out.println("j is greater");
   } 
 else
 {
   System.out.println("k is graeter");
   } 
  }
  }
 