import java.awt.*;
import javax.swing.*;
public class SlideColor {
	public static void main(String[] args)
	{
	JFrame frame = new JFrame("SlideColors");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(new SlideColorPanel());
	frame.pack();
	frame.setVisible(true);
	}
}
