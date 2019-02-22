class Room
{
int length;
int breadth;
 }
 class Area
 {
  public static void main(String args[])
  {
  Room a1=new Room();
  Room a2=new Room();
  a1.length=10;
  a1.breadth=20;
  a2.length=30;
  a2.breadth=40;
  System.out.println("area of room1="+(a1.length*a1.breadth));
  System.out.println("area of room2="+(a2.length*a2.breadth));
  
   
   }
 }