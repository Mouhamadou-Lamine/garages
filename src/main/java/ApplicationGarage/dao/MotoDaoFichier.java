package ApplicationGarage.dao;

import java.util.ArrayList;

import ApplicationGarage.Classe.Moto;

public class MotoDaoFichier implements IMotoDao {

	@Override
	public Moto save(Moto entity) {
		System.out.println("Sauvegarde d'une moto");
		return null;
	}

	@Override
	public ArrayList<Moto> findAll() {
		System.out.println("Recherche des motos");
		return null;
	}

	@Override
	public Moto findById(int id) {
		System.out.println("Recherche d'une moto");
		return null;
	}

	@Override
	public Moto deleteById(int id) {
		System.out.println("Suppression d'une moto");
		return null;
	}

}
