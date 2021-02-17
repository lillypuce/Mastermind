import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;

public class VuePropositions extends Canvas{
	Modèle modl;
	Frame mainFrame;
	Dimension d;
	
	
	public VuePropositions(){
		super();
		this.modl=new Modèle();
		this.d=new Dimension(100,100);
		this.setSize(d);
		
		
		
		
		
		
	}
	
	public void cercle(Graphics g) {
		g.setColor(Color.lightGray);
		
		
		int x=10;
		for(int i=0;i<4;i++) {
			g.drawOval(x+i*10, x, 10, 10);
			g.setColor(Color.BLACK);
		}
		
		//g.drawOval(10, 10, 10, 10);
		//g.setColor(Color.BLACK);
		
	//	g.drawOval(20, 10, 10, 10);
		//g.setColor(Color.BLACK);
		
		//g.drawOval(30, 10, 10, 10);
	//	g.setColor(Color.BLACK);
		
	//	g.drawOval(40, 10, 10, 10);
		//g.setColor(Color.BLACK);
		
	}
	
	
	
	
	


}
