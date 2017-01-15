import java.awt.Graphics;
import javax.swing.JComponent;

public class HousePicture extends JComponent { //Class that draws lines and rectangles to make house

	public void paint(Graphics g) {
		g.drawRect(75, 100, 200, 100);
		g.drawRect(120, 120, 20, 20);
		g.drawRect(210, 120, 20, 20);
		g.drawRect(165, 150, 20, 50);
		g.drawLine(75, 100, 125, 50);
		g.drawLine(275, 100, 225, 50);
		g.drawLine(125, 50, 225, 50);

	}
}
