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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 */
public class DemoSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");     // charge la classe Driver du pilote de mysql
        
        // crée une connection (la connection avec mysql) 
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/stock", "root", "root");
        //                                                   |    |       |         |        |       |
        //                                                   |    |       |         |        |       password
        //                                                   |    |       |         |        user
        //                                                   |    |       |         database
        //                                                   |    |       server
        //                                                   |    dbengine
        //                                                   utilse JDBC
        
        // crée une statement : un objet pour gérer l'instruction SQL
        Statement statement = connection.createStatement();
        
        // demande à mysql d'exécuter la requête SQL
        // et retourne un resultSet : un ensemble de résultats,
        // cet objet sert à récupérer les résultats de la requête SQL
        ResultSet resultSet = statement.executeQuery("SELECT * FROM produit WHERE label = 'petit coca'");
        
        if(resultSet.next()) {
            Product product = new Product(      // crée un nouveau Product
                    resultSet.getString(1), 
                    resultSet.getDouble(2), 
                    resultSet.getString(3), 
                    resultSet.getString(4)
            );
            System.out.println(product);
        } else {
            System.out.println("Pas de record");
        }
        
    }
}
