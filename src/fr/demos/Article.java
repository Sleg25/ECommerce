package fr.demos;

public class Article {

	double prixHT;
	String description;
	int stock;
	String reference;
	
	
	
	//Constructeur**************************************************************************************************************************************************************************************************
	public Article(double prixHT, int stock, String description, String reference){
		this.prixHT = prixHT;
		this.stock = stock;
		this.description = description;
		this.reference = reference;
		
	}
	
	//getters**************************************************************************************************************************************************************************************************
	
	
	
	

	public int getStock() {
		return stock;
	}

	public String getDescription() {
		return description;
	}
	
	public String getReference() {
		return reference;
	}
	
	public double getPrixHT() {
		return prixHT;
	}
	
	
	@Override
	public String toString() {
		return Article.this.getClass().getSimpleName();
	}
	
	
	
}
