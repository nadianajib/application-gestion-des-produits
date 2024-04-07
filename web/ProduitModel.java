package web;

public class ProduitModel {
	private String motCle;
	private List<Produit> produits=new ArrayList<produit>();
    public String getMotCle() {
    	return motCle;
    }
  public void setMotCle(String motCle) { 
   this.motCle=motCle; 
    
}
  public List<Produit> getProduits(){
      return produits;
  }
  public void setProduits(List<Produits>produits) {
  this.produits =produits;
  }
}
}