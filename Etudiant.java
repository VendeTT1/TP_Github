public class Etudiant{
	private Long id;
	private String nom;
	private String prenom;
	private double moyenne;
	private double note;

	public String getNom(){
		return nom;
	}

	public String setNom(String nom_etd){
		this.nom = nom_etd;
		return nom;
	}
	
}
