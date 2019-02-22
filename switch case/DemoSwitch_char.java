class DemoSwitch_char
 {
  public static void main(String args[])throws Exception 
  {
  System.out.println("enter ur choice");
  System.out.println("a=airlines resevations,b=Bus,c=Car,t=train,s=ship);
  char ch=(char)System.in.read();
  System.out.println("-----------------");
  System.out.println("ur choice is::"+ch);
  switch(ch)
  {
  case 'a':
  case 'b';
  System.out.println("welcome the airlines reservation sytem");
  break;
  
  }
 }