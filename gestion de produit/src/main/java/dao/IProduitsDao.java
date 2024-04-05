package dao;
import metier.entities.Produits;

public interface IProduitsDao {
	
public Produits save(Produits p);
public List<Produits> produitsParMC(String mc);

}
