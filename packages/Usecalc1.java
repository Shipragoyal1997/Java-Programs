import com.rat.demo.Calc;
class Usecalc1
{
 public static void main(String args[])
 {
  Calc c=new Calc(2.2,3.3);
  c.sum();
  c.multiplication();
  System.out.println("Power is"+c.getPower(3,4));
  System.out.println("Sqrt is"+c.getSqrt(144));
  }
 }
 