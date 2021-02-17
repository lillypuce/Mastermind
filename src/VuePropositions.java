import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;

public class VuePropositions extends Canvas{
	Modèle modl;
	Frame mainFrame;
	
	
	
	public VuePropositions(){
		super();
		this.modl=new Modèle();
		
		mainFrame=new Frame("test");
		mainFrame.setSize(500,500);
		
		mainFrame.setBackground(Color.GRAY);
		mainFrame.pack();
		mainFrame.setVisible(true);
		
		
		
		
	}
	
	public void cercle(Graphics g) {
		
		g.drawOval(10, 10, 10, 10);
		g.setColor(Color.BLACK);
		
		g.drawOval(20, 10, 10, 10);
		g.setColor(Color.BLACK);
		
		g.drawOval(30, 10, 10, 10);
		g.setColor(Color.BLACK);
		
		g.drawOval(40, 10, 10, 10);
		g.setColor(Color.BLACK);
		
	}
	
	
	
	
	


}
