//
//	import java.awt.Dimension;
//	import java.awt.Point;
//	import java.awt.event.ActionEvent;
//	import java.awt.event.ActionListener;
//
//	import javax.swing.JButton;
//	import javax.swing.JFrame;
//	import javax.swing.JLabel;
//
//	public class ActionListenerPossibliity implements ActionListener
//	{
//
//		public static void main(String[] args) 
////		{
////			//incorporate spaces into your code -> paragraphs of code
//			//JFrame myFrame = new JFrame();
//			JFrame myFrame = new JFrame("Our First Frame");     //can also be created through a method (myFrame.setTitle())
//			myFrame.setBounds(400,400,600,300);
//			myFrame.setLayout(null); //b/c we don't want a layout -> need null
//			
//			JLabel label1 = new JLabel("Our First Label");   
//			label1.setSize(100,30);
//			//label1.setLocation(35,50);   this or the one below works 
//			label1.setLocation(new Point(40,30));
//			//or setBounds(50,50,80,30) -> setBounds is the combination of setLocation and setSize
//			myFrame.add(label1);
//			
//			//create a button 40 pixels to the right of the JLabel
//			JButton button = new JButton("Our First Button");
//			button.setLocation(new Point(180,30));           //JLabel stars at x = 40 and is 100 pixels long -> 140 + 40 = 180 pixels    
//			button.setSize(new Dimension(100,30));     //width and height
//			
//		
//			buttonListener listener = new buttonListener();
//			button.addActionListener(listener);
//			myFrame.add(button);
//			
//			myFrame.setVisible(true);  //always setVisible at the END of your program
////			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////
////		}
//		
//		public void actionPerformed(ActionEvent e)
//		{
//			label1.setText("action listener");
//		}
//	}
//
//}
