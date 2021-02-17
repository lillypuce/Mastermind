import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Contrôleur implements ActionListener{

	Modèle modl;
	
	public Contrôleur(Modèle m) {
		this.modl = m;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {

		int couleurBouton = Integer.valueOf(e.getActionCommand());
		this.modl.completerProposition(couleurBouton);
	}
	
}
