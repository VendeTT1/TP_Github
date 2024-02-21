public class Etudiant{
	private Long id;
	private String nom;
	private String prenom;
	private double moyenne;	
	private float notes;

	public String getNom(){
		return nom;
	}

	public String setNom(String nom_etd){
		this.nom = nom_etd;
		return nom;
	}
	
}
