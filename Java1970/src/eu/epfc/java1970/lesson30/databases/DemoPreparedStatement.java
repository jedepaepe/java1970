/*
Démo SELECT * FROM product
basée sur Introduction_to_Java Programming_Comprehensive_Version page 1193 
! vous devez avoir ajouter le "MySQL JDBC Driver" à votre projet, sous "Library"
 */
package eu.epfc.java1970.lesson30.databases;

// ! ne pas importer les librairies de mysql : 
//      nous travaillons avec le JDBC qui cache mysql
import eu.epfc.java1970.lesson28.productList.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 */
public class DemoPreparedStatement {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // variable pour simuler une entrée de l'utilisateur
        String label = "petit coca";

        // (1) charge la classe Driver du pilote de mysql
        Class.forName("com.mysql.jdbc.Driver");     
        
        // (2) crée une connection (la connection avec mysql) 
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "root");
        
        // (3) crée une statement : un objet pour gérer l'instruction SQL & demande à mysql de précompiler la requête SQL
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM produit WHERE label = ?");

        // (4) injecte la variable dans la preparedStatement
        preparedStatement.setString(1, label);
        //                          |  |
        //                          |  la valeur à injecter dans la requête SQL (à la place du ?)
        //                          le premier ?

        // (5) exécute la requête
        ResultSet resultSet = preparedStatement.executeQuery();
        
        if(resultSet.first()) {
            Product product = new Product(      // crée un nouveau Product
                    resultSet.getString("label"), 
                    resultSet.getDouble("price"), 
                    resultSet.getString("unit"), 
                    resultSet.getString("description")
            );
            System.out.println(product);
        } else {
            System.out.println("Pas de record");
        }
        
    }
}
