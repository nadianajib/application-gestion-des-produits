package dao;

import metier.entities.Produits;

public class testDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		produitDaoImpl dao = new produitDaoImpl();
		Produits p1= dao.save(new Produits("najia",20,200,"najia ghzala"));
		Produits p2= dao.save(new Produits("nadia",1,100,"nadia lfena"));
		Produits p3= dao.save(new Produits("bassma",30,330,"bassma mkhassmin"));
	    System.out.print(p1.toString());
	    System.out.print(p2.toString());
	    

	}

}
