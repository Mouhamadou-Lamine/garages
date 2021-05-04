package ApplicationGarage.dao;

import java.util.ArrayList;

import ApplicationGarage.Classe.Client;

public class ClientDaoFichier implements IClientDao {

	@Override
	public Client save(Client entity) {
		System.out.println("Sauvegarde d'un client");
		return null;
	}

	@Override
	public ArrayList<Client> findAll() {
		System.out.println("Recherche des clients");
		return null;
	}

	@Override
	public Client findById(int id) {
		System.out.println("Recherche d'un client");
		return null;
	}

	@Override
	public Client deleteById(int id) {
		System.out.println("Suppresion d'un client");
		return null;
	}
	
}
