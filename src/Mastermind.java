import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Mastermind extends Frame implements WindowListener {
	
	Modèle modl;
	
	public Mastermind() {
		
		this.modl=new Modèle();
		
		this.setLayout(new BorderLayout());
		
		VuePropositions panneaugauche= new VuePropositions();
		this.add(panneaugauche,BorderLayout.WEST);
		
		VueClavier panneauBas=new VueClavier();
		this.add(panneauBas, BorderLayout.SOUTH);
		
		
		this.addWindowListener(this);
		this.setTitle("Test");
		this.pack();
		this.setVisible(true);
		
	}
	@Override
	public void windowClosing(WindowEvent e) { 
		
		System.exit(0); 
	}
	

	public static void main(String[] args) {
		new Mastermind();

	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
