class Demo 
{
 char convertIntochar( int asciivalue )
 {
  return (char)asciivalue;
 }
 float multiplication (float a, float b)
 {
  return (a*b);
 }
 }
 class Program
 {
  public static void main(String args[])
  {
  Demo d=new Demo();
  char c=d.convertIntochar(93);
  System.out.println("character is :"+c);
  float f=d.multiplication(3.3f ,4.4f);
  System.out.println("multiplication is:"+f);
  }
 }
  