
public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int nbAnnee;
	private String[] competence = new String[2];
	private String attente;
	
	public static void main(String[] args) {
		
	}

	void affiche() {
		System.out.println("\nnom: " + nom + " \nprenom: " + prenom + " \nformation: " + formation +
				", \nnbAnnee: " + nbAnnee + " \ncompetence: " + toutCompetence(competence) + " \nattente: " 
				+ attente);
	}
	
	public String toutCompetence(String[] competence){
		
		String toutCompetence = null;
		
		toutCompetence = competence[0] + ", " + competence[1];
		
		return toutCompetence;
	}
}

