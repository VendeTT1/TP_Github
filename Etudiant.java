public class Etudiant{
	private Long id;
	private String nom;
	private String prenom;
<<<<<<< HEAD
	private double moyenne;
	private float notes;
=======
	private double moyenne;	
	private double notes;
>>>>>>> featureNotes

	public String getNom(){
		return nom;
	}

	public String setNom(String nom_etd){
		this.nom = nom_etd;
		return nom;
	}
	
}
