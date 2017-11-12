
public class Employe_Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Creation d'un employe et definition de son salaire");
		
		Salaire salarieUn = new Salaire();
		
		salarieUn.setNom("Ndepo");
		salarieUn.setPrenom("Paul");
		salarieUn.setAnneeEmbauche(2014);
		salarieUn.Salaire(3);
		
		System.out.println(salarieUn.toString());
		
		
		
		

	}

}
