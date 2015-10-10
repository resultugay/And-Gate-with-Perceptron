package And;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class shapes extends JPanel{
		JPanel panel;
		public shapes(JPanel panel){
			this.panel = panel;
		}
		//=========================================== paintComponent
		public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawCircle(g, 250, 210, 20); // center (30,30) r=20
		g.drawLine(150, 170, 230, 210);
		g.drawLine(150, 210, 230, 210);
		g.drawLine(150, 250, 230, 210);
		g.drawLine(270, 210, 330, 210);
		}
		
		// Convenience method to draw from center with radius
		public void drawCircle(Graphics cg, int xCenter, int yCenter, int r) {
		cg.drawOval(xCenter-r, yCenter-r, 2*r, 2*r);
		
		}//end drawCircle
}
