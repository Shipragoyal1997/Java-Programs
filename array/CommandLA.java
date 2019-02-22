class CommandLA
{
 public static void main(String arr[])
 {   
    int len = arr.length;
  System.out.println("length is ="+len);
  if(len == 0)
  System.out.println("no command line argument");
  else
  {
   System.out.println("command line values are");
   for(int i=0;i<len;i++)
  {
   System.out.println("arr["+i+"] is "+arr[i]);
  }
  } 
}
}