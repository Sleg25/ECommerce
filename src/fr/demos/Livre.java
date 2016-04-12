package fr.demos;

public class Livre extends Article{


	private String titre;
	private String auteur;
	private String editor;
	private String genre;
	private double taxe;
	
	//contructeur**************************************************************************************************************************************************************************************************
	public Livre(double prixHT, int stock, String description, String reference, String titre,	String auteur,	String editor,	String genre) {
		super(prixHT, stock, description, reference);
		this.titre = titre;
		this.auteur = auteur;
		this.editor = editor;
		this.genre =  genre;
		taxe = 0.21;
	}
	
	
	
	//getters**************************************************************************************************************************************************************************************************
	public String getTitre() {
		return titre;
	}



	public String getAuteur() {
		return auteur;
	}



	public String getEditor() {
		return editor;
	}


	public String getGenre() {
		return genre;
	}
	
	public double prixTTC(){
		return (prixHT + (prixHT * taxe));
	}

	
}
