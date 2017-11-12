
public abstract class Employe {

	 protected static String  nomEmp;
	 protected static String prenomEmp;
	 
	 /**
	  * Default constructor sans parametres
	  */
	 public Employe() {
		 nomEmp = "";
		 prenomEmp ="";
	 }
	 /**
	  * Constructor avec parametres
	  * @param nom
	  * @param prenom
	  */
	 public Employe(String nom, String prenom) {
		 
	 }
	 
	 /**
	  * List des Getters et Setters
	  */
	/**
	 * setter du nom de l'employe
	 * @param nom
	 */
	 public void setNom(String nom) {
		 this.nomEmp = nom;
	 }
	 
	 /**
	  * Getter du nom
	  * @return nom de l'employee
	  */
	 public String getNom() {
		 return nomEmp;
	 }
	 
	 public void setPrenom(String prenom) {
		 this.prenomEmp = prenom;
	 }
	 
	 public String getPrenom() {
		 return prenomEmp;
	 }
	 
	 public abstract void Salaire(int annee);
	 
	 /**
	  * cette methode permet d'afficher les infos ou les proprietes de l'employe dans un 
	  * style que tu peux preformatter, cela te permettra d'eviter d'appeler getNom() ou getPrenom()
	  */
//	 @Override
//	   public String toString()
//	   {
//	       return String.format("L'employe %s %2s ", nomEmp, prenomEmp);
//	   }
	 
}

