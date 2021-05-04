package ApplicationGarage.Classe;

import ApplicationGarage.Interface.*;

public abstract class Utilisateur {
	//Attributs
	private String nom, prenom, mail, mdp;
	
	
	//Accesseurs
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	
	//Méthode
	public void acheter(IAchetable produit) {
		System.out.println("L'utilisateur achète " + produit);
	}
}
