package ApplicationGarage.dao;

import java.util.ArrayList;

import ApplicationGarage.Classe.Piece;

public class PieceDaoFichier implements IPieceDao {

	@Override
	public Piece save(Piece entity) {
		System.out.println("Sauvegared d'une piece");		
		return null;
	}

	@Override
	public ArrayList<Piece> findAll() {
		System.out.println("Recherche des pi�ces");		
		return null;
	}

	@Override
	public Piece findById(int id) {
		System.out.println("Recherche d'une pi�ce");		
		return null;
	}

	@Override
	public Piece deleteById(int id) {
		System.out.println("Suppression d'une pi�ce");		
		return null;
	}

}
