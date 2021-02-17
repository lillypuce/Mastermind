import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;

public class VuePropositions extends Canvas{
	Modèle modl;
	Frame mainFrame;
	
	
	public VuePropositions(){
		
		mainFrame=new Frame("test");
		mainFrame.setSize(500,500);
		
		mainFrame.setBackground(Color.GRAY);
		mainFrame.setVisible(true);
		
		
		
		
	}
	
	public void cercle(Graphics g) {
		
		g.drawOval(10, 10, 10, 10);
		g.setColor(Color.BLACK);
		
	}
	
	
	
	
	


}
