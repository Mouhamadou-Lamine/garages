package ApplicationGarage.Classe;

import ApplicationGarage.Interface.IAchetable;

public class Piece implements IAchetable {
	//Attributs
	private String nom, marque;
	private float prix;
	private int quantite;

	
	//Accesseurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
