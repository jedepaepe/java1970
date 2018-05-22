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
        String label = "petit coca";
        Class.forName("com.mysql.jdbc.Driver");     // charge la classe Driver du pilote de mysql
        
        // crée une connection (la connection avec mysql) 
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "root");
        //                                                   |    |       |         |        |       |
        //                                                   |    |       |         |        |       password
        //                                                   |    |       |         |        user
        //                                                   |    |       |         database (optionnel)
        //                                                   |    |       server
        //                                                   |    dbengine
        //                                                   utilse JDBC
        
        // crée une statement : un objet pour gérer l'instruction SQL
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM produit WHERE label = ?");

        // injecte la variable dans la preparedStatement
        preparedStatement.setString(1, label);
        
        // exécute la requête
        ResultSet resultSet = preparedStatement.executeQuery();
        
        // System.out.println(resultSet.getString(1)); // crashe le programme
        
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
