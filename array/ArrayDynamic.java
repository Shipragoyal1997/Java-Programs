class ArrayDynamic
{
 public static void main(String args[])
 {   
  int arr[]= new int[(int)(Math.random()*15)];
  int len=arr.length;
  System.out.println("length is ="+len);
  for(int i=0;i<len;i++)
  {
   arr[i] = (int)(Math.random()*100);
   System.out.println("arr["+i+"] is "+arr[i]);
 
  } 
}
}