import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameExample {

	public static void main(String[] args) 
	{
		JFrame myFrame = new JFrame();
		myFrame.setBounds(300,300,500,300);
		myFrame.setLayout(null); //b/c we don't want a layout -> need null
		
		JLabel label1 = new JLabel("our first Label");   
		label1.setSize(80,30);
		//label1.setLocation(35,50);   this or the one below works 
		label1.setLocation(new Point(50,50));
		myFrame.add(label1);
		
		myFrame.setVisible(true);  //always setVisible at the END of your program
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
