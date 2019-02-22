import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
//<applet Code="FirstProgram.class" width="400" height="400"></applet>
public class FirstProgram extends Applet {
	public void init()
	{
		System.out.println("init method caled");
		setBackground(Color.cyan);
		setForeground(Color.PINK);
		Font f=new Font("MONOSPACED",Font.BOLD,30);
		setFont(f);
	}
	public void start()
	{
		System.out.println("applet started");
	}
	public void stop()
	{
		System.out.println("applet stopped");
	}
	public void destroy()
	{
		System.out.println("Applet destroyed");
		
	}
	public void paint(Graphics g)
	{
		 g.drawString("SHIPRA", 100, 100);
	}
}
