import javax.swing.JOptionPane;
class Multiply
{
 public static void main(String args[])
 {
  String s1=JOptionPane.showInputDialog("enter the no:");
  String s2=JOptionPane.showInputDialog("enter the no:");
  int i=Integer.parseInt(s1);
  int j=Integer.parseInt(s2);
  int m=i*j;
  System.out.println("product is:"+m);
  JOptionPane.showMessageDialog(null,"product is:"+m);
  }
  }