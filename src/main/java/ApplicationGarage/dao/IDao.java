package ApplicationGarage.dao;
import java.util.ArrayList;

public interface IDao<T> {
	
	public T save(T entity);

	public ArrayList<T> findAll();

	public T findById(int id);

	public T deleteById(int id);

}