import java.awt.Color;

public class Modèle {
	
	static Color[] COULEURS = {Color.yellow,Color.green,Color.blue,Color.magenta,Color.red,Color.orange,Color.white,Color.black};
	static Integer N_TENTATIVES = 10;
	static Integer DIFFICULTE = 4;
	enum Etat {EN_COURS,GAGNE,PERDU};
	
	Etat état;
	Rangée combinaison;
	Rangée[] propositions;
	Integer tentative;
	
	public Modèle() {
		this.combinaison = new Rangée();
		
		this.propositions = new Rangée[Modèle.N_TENTATIVES];
		
		this.tentative=  0;
		
		this.état = Etat.EN_COURS;
	}

	public void completerProposition(int couleurBouton) {
		//TODO récupérer la couleur
		Color c = Modèle.COULEURS[couleurBouton];
		Rangée courante = this.propositions[this.tentative];
		courante.compléter(c);
	}
	
}
