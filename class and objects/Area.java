class Room
{
 int length ,breadth,height;
 void getvalue (int a,int b, int c)
 {
 length=a;
 breadth=b;
 height=c;
 }
 void area()
 {
 System.out.println("area is "+(length*breadth));
 }
 double volume()
 {
 return (length*breadth*height);
 }
 }
 class Area 
 { 
  public static void main(String args[])
  {
   Room r=new Room();
   r.getvalue(2,3,4);
   r.area();
   double vol=r.volume();
   System.out.println("volume is : "+vol);
  }
 }