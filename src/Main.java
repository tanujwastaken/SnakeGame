import javax.swing.JFrame;

public class Main 
{
	public static void main(String[] args) 
	{
		//Creating the window
		Window f1= new Window();
		//Window settings
		f1.setTitle("Snake");
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);             
	}
}
