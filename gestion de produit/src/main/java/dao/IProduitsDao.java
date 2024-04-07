package dao;
import metier.entities.Produits;

public interface IProduitsDao {
	
public Produits save(Produits p);
public List<Produits> produitsParMC(String mc);
public Produits getProduit(int id);
public Produits update(Produits P);
public void deleteProduit(int id);


}
