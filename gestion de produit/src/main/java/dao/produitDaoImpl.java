package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import metier.entities.Produits;

public class produitDaoImpl implements ProduitDao{

	@Override
	public Produits save(Produits p) {
	Connection connection=SingletonConnectio.getConnection();
	try {
		PreparedStatement ps =connection.prepareStatement("insert into produits (nom,quantité,prix,description)values(?,?,?,?)");
          ps.setString(1, p.getNom());
          ps.setInt(2,p.getQuantite());
          ps.setFloat(3,p.getPrix());
         
          ps.setString(4,p.getDescription());
          PreparedStatement ps2=connection.prepareStatement("SELECT max(id) as max_id FROM produits");
          ResultSet rs =ps2.executeQuery();
          if(rs.next()) {
        	  p.setId(rs.getInt("max_id"));
          }
          ps.close();
          
	}catch(SQLException e) {
		// TODO AUTO-generated catch block
		e.printStackTrace();
	}
	return p ;
	
	}

	@Override
	public List<Produits> produitsParMc(String mc) {
		List <Produits> Produit= new ArrayList<Produits>();
			Connection connecetion = SingletonConnectio.getConnection();
			try {
				PreparedStatement  ps = connecetion.prepareStatement("SELECT * FROM PRODUITS WHERE nom LIKE ?");
                  ps.setString(1, mc);
                  
                  ResultSet rs = ps.executeQuery();
                  while(rs.next()) {
                	  Produit p=new Produit();
  					p.setId(rs.getLong("id"));
  					p.setNom(rs.getString("nom"));
  					p.setPrix(rs.getDouble("prix"));
                      p.setQuantité(rs.getInt("quantité"));
                      produits.add(p);
                	  
                  }
			}catch(SQLException e) {
			
			e.printStackTrace();
				
			}
		return produits;
	}

	@Override
	public Produits getProduit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produits getProduits(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produits update(Produits P) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
