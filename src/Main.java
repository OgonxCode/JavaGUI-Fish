import javax.swing.JFrame;//imports tools for making the window
import javax.swing.JPanel;//imports tools for making a canvas inside the window
import java.awt.Dimension;//imports tools for storing width and height

public class Main {
	public static void main(String [] args) {
		JFrame frame = new JFrame("EcoSystem");// creates a new frame object
		
		DrawingPanel panel = new DrawingPanel();// creates a new panel from drawing panel class
		
		frame.add(panel);//adds the panel to the frame so canvas can be drawn in the window
		frame.setResizable(false);//prevents user from resizing
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes frame when u press x 
		frame.setVisible(true);//make window visible/pop up
		
		
		
	}
}

// Create custom type of panel so we can draw custom objects on it
class DrawingPanel extends JPanel{
	//Code here is on my custom drawing surface
	public DrawingPanel() {
		setPreferredSize(new Dimension(800,600));
	}
}