package ApplicationGarage.dao;

import java.util.ArrayList;

import ApplicationGarage.Classe.Voiture;
import ApplicationGarage.Interface.*;
public class VoitureDaoFichier implements IVoitureDao {

	@Override
	public Voiture save(Voiture entity) {
		System.out.println("Sauvegarde d'une voiture");
		return entity;
	}

	@Override
	public ArrayList<Voiture> findAll() {
		System.out.println("Recherche des voitures");		
		return null;
	}

	@Override
	public Voiture findById(int id) {		
		System.out.println("Recherche d'une voiture");		
		return null;
	}

	@Override
	public Voiture deleteById(int id) {
		System.out.println("Suppression d'une voiture");		
		return null;
	}
	
}
