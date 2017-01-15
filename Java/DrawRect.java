//Mackenzie Clarkson
//Assignment 2
//Oct 16 2016
//House Picture Problem #2
import javax.swing.JFrame;

public class DrawRect {
	public static void main(String[] a) { 	//main function setting up JFrame resolution 
											//and calling from HousePicture class to get coordinates of shapes
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(30, 30, 400, 300);
		window.getContentPane().add(new HousePicture());
		window.setVisible(true);
	}
}