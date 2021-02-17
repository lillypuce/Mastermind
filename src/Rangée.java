import java.awt.Color;

public class Rangée {
	
	int[] jetons;
	int indiceJeton;
	
	public class Résultat {
		int blancs;
		int noirs;
	}
	
	Résultat résultat;
	
	public Rangée() {
		this.jetons = new int[Modèle.DIFFICULTE];
		this.indiceJeton = 0;
	}
	
	public boolean compléter(int c) {
		this.jetons[this.indiceJeton];
		//TODO Si c'est le dernier jeton de la rangée
		//évaluer
		//indiquer au modèle qu'on doit faire une nouvelle rangée
	}

}
