package dao;

import metier.entities.Produits;

public class testDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		produitDaoImpl dao = new produitDaoImpl();
		Produits p1= dao.save(new Produits("Paracétamol", 100, 5.99, "Soulage la douleur et la fièvre"));
		Produits p2= dao.save(new Produits("Ibuprofène", 50, 7.49, "Anti-inflammatoire et antipyrétique"));
		Produits p3= dao.save(new Produits("Aspirine", 80, 4.99, "Réduit la douleur l inflammation et la fièvre");
				
	    System.out.print(p1.toString());
	    System.out.print(p2.toString());
	    System.out.println("chercher des produits");
		List<Produit> prods=dao.produitsParMC("H%");
		for(Produit p :prods){
			System.out.println(p.toString());
	    
		}
	    

	}

}
