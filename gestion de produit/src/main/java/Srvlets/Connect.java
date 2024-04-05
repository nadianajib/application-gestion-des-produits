package Srvlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect {

    public static void main(String[] args) {
        try {
            // Chargement du pilote JDBC PostgreSQL
            Class.forName("org.postgresql.Driver");

            // Établissement de la connexion avec la base de données PostgreSQL
            String url = "jdbc:postgresql://localhost:2002/pharmacie";
            String username = "postgres";
            String password = "admin";
            Connection con = DriverManager.getConnection(url, username, password);

            // Création de l'objet Statement
            Statement stmt = con.createStatement();

            // Exécution de la requête SELECT
            ResultSet rs = stmt.executeQuery("SELECT * FROM produits");

            // Traitement des résultats
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + " " + rs.getFloat(4)+" "+
                rs.getString(5));
            }

            // Fermeture de la connexion
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
