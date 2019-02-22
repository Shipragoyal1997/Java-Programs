import javax.swing.JOptionPane;
class Sum2
{
 public static void main(String args[])
 {
 String s1 = JOptionPane.showInputDialog("enter no:");
 String s2 = JOptionPane.showInputDialog("enter no:");
 int i = Integer.parseInt(s1);
 int j = Integer.parseInt(s2);
 int sum=i+j;
 System.out.println("sum is:"+sum);
 JOptionPane.showMessageDialog(null,"sum is :"+sum);
 }
 }