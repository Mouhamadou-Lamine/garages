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
		System.out.println("Recherche des pièces");		
		return null;
	}

	@Override
	public Piece findById(int id) {
		System.out.println("Recherche d'une pièce");		
		return null;
	}

	@Override
	public Piece deleteById(int id) {
		System.out.println("Suppression d'une pièce");		
		return null;
	}

}
