package ApplicationGarage.Classe;

import ApplicationGarage.Enum.Couleur;
import ApplicationGarage.Interface.*;

public abstract class Vehicule implements IAchetable {
	//Attributs
	 String modele, marque;
	private float prix;
	private Couleur couleur;
	int quantite;
	
	//Accesseurs
	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
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

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

}
