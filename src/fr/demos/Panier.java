package fr.demos;
import java.util.ArrayList;

public class Panier {

	private ArrayList<Article> listeArticle;
	private int nombreArticle;
	
		public Panier(){
			listeArticle = new ArrayList<Article>();
			this.nombreArticle = 0;
		}
		
	public void ajoutArticle(Article article, int nombre){
		listeArticle.add(article);
		this.nombreArticle = this.nombreArticle + nombre;
	}
	
	
	public void retirerArticle(Article article, int nombre){
		listeArticle.remove(article);
		this.nombreArticle = this.nombreArticle + nombre;
	}
	
	public int getNombreArticle1(){
		return nombreArticle;
	}
	
	
	
	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Panier ["+"\n" + "liste des article=" + listeArticle +"\n" +", nombre d'article=" + nombreArticle + "]" + "\n";
	}

	
}
