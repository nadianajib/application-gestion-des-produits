<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
   
    <form action="AjoutProduitServlet.java" method="get">
        <input type="submit" value="Ajouter Produit">
    </form>
    <form action="ModifierProduitServlet.java" method="get">
        <input type="submit" value="Modifier Produit">
    </form>
    <form action="SupprimerProduitsServlet.java" method="get">
        <input type="submit" value="Supprimer Produits">
    </form>
    <form action="ListeProduitsServlet.java" method="get">
        <input type="submit" value="Liste Produits">
    </form>
</body>
</html>
