
public class CV {

	private String nom;
	private String prenom;
	private String formation;
	private int nbAnnee;
	private String[] competence = new String[2];
	private String attente;
	
	public static void main(String[] args) {
		
		CV cv = new CV();
		cv.nom = "Chow";
		cv.prenom = "Anthony";
		cv.formation = "Technique de l'informatique";
		cv.nbAnnee = 2;
		cv.competence[0] = "Coder";
		cv.competence[1] = "Décoder";
		cv.attente = "Apprendre à bien maîtriser le GIT.";
		
		CV cv2 = new CV();
		cv2.nom = "Chrisphonte";
		cv2.prenom = "Vladimir";
		cv2.formation = "Technique de l'informatique";
		cv2.nbAnnee = 2;
		cv2.competence[0] = "Base de données";
		cv2.competence[1] = "Identification";
		cv2.attente = "Apprendre à bien maîtriser le GIT.";
		
		System.out.println("Bienvenue chez Barette!");
		
		cv.affiche();
		cv2.affiche();
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

