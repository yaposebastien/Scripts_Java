
public class Salaire extends Employe {

	
	private int anneEmbauche;
	private static final  double SALAIREBASE =150000; 
	private double salaire;
	
	public Salaire() {
		
		super(nomEmp, prenomEmp); //  Construction de la classe Employe dans Salaire
		
	}
	
	public void setAnneeEmbauche(int annee) {
		this.anneEmbauche = annee;
	}
	public int getAnneeEmbauche() {
		return anneEmbauche;
	}
	public double getSalaire() {
		return salaire;
	}
	
	

	@Override
	public void Salaire(int annee) {
		double salaireFinal = 0;
		
		if(annee == 0)
		{ salaire = SALAIREBASE + 50000;}
		if(annee == 1)
		{ salaire = SALAIREBASE + 80000; }
		if(annee >= 2) 
		{ salaire = SALAIREBASE + 100000;}
	}
	@Override
	public String toString() {
		return String.format("L'employe %s %2s a ete embauche en %d. \n Il a un salaire de %.2f ", 
				Salaire.nomEmp, Salaire.prenomEmp, anneEmbauche, salaire);
	}
	
}
