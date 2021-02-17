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
		this.d=new Dimension(100*Modèle.DIFFICULTE,50*Modèle.N_TENTATIVES);
		this.setSize(d);
		
		
	
		
	}
	@Override
	public void paint(Graphics g) {

		g.setColor(Color.BLACK);		
		
		int x=10;
		int y=10;
		for(int j =0; j<Modèle.N_TENTATIVES;j++) {
			for(int i=0;i<Modèle.DIFFICULTE;i++) {
				x = (i * 40) + 10;
				y = (j * 40) + 10; 
				g.setColor(Color.GREEN);
				g.fillOval(x, y, 30, 30);
				
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
	
	
	
	


}
