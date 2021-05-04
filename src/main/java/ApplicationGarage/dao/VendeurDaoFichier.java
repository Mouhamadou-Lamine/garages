package ApplicationGarage.dao;

import java.util.ArrayList;

import ApplicationGarage.Classe.Vendeur;

public class VendeurDaoFichier implements IVendeurDao {

	@Override
	public Vendeur save(Vendeur entity) {
		System.out.println("Sauvegarde d'un vendeur");
		return null;
	}

	@Override
	public ArrayList<Vendeur> findAll() {
		System.out.println("Recherche des vendeurs");
		return null;
	}

	@Override
	public Vendeur findById(int id) {
		System.out.println("Recherche d'un vendeur");
		return null;
	}

	@Override
	public Vendeur deleteById(int id) {
		System.out.println("Suppression d'un vendeur");
		return null;
	}
	
}
