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

}
