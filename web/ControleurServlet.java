package web

import javax.servlet.http.HttpServlet;

public class ControleurServlet  extends HttpServlet{
  private IProduitDao metier;
  
  @Override
public void init() throws ServletException {
	  metier=new ProduitDaoImpl();
  }
	doGet
}
