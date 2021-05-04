package ApplicationGarage;

import ApplicationGarage.Classe.*;
import ApplicationGarage.dao.*;

public class ApplicationPrincipale {
	
	public static void main(String[] args) {
		Client client = new Client();
		IPieceDao piece = DaoFactory.creerPieceDao();
		piece.save(new Piece());
		
		client.acheter(piece.findById(0));
		
		piece.deleteById(0);
	}
}




