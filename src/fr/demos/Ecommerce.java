package fr.demos;

public class Ecommerce {

	public static void main(String[] args) {
	
	Panier panier1 = new Panier();
	Livre scrum1 = new Livre(122, 10, "Apprendre le java", "5412HJHV215", "Java pour les nuls",	"Alexandre Le Corvisart",	"Saint Lazare Print",	"informatique");
	Livre scrum2 = new Livre(120, 11, "Apprendre le java", "5412HJHV215", "Java pour les nuls",	"Alexandre Le Corvisart",	"Saint Lazare Print",	"informatique");
	Livre scrum3 = new Livre(122, 10, "Apprendre le java", "5412HJHV215", "Java pour les nuls",	"Alexandre Le Corvisart",	"Saint Lazare Print",	"informatique");
	Livre scrum4 = new Livre(122, 10, "Apprendre le java", "5412HJHV215", "Java pour les nuls",	"Alexandre Le Corvisart",	"Saint Lazare Print",	"informatique");
	
	panier1.ajoutArticle(scrum1,2);
	panier1.ajoutArticle(scrum2,3);
	panier1.ajoutArticle(scrum3,5);
	panier1.ajoutArticle(scrum4,1);
	
	System.out.println(panier1.toString());
	}
	
}
