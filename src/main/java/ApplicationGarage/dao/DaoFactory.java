package ApplicationGarage.dao;

public class DaoFactory {

	public static IClientDao creerClientDao() {
		return new ClientDaoFichier();
	}

	public static IVendeurDao creerVendeurDao() {
		return new VendeurDaoFichier();
	}

	public static IPieceDao creerPieceDao() {
		return new PieceDaoFichier();
	}

	public static IMotoDao creerMotoDao() {
		return new MotoDaoFichier();
	}
	
	public static IVoitureDao creerVoitureDao() {
		return new VoitureDaoFichier();
	}
}
