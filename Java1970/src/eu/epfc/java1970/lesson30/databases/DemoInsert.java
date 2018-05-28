/*
Démo SELECT * FROM product
basée sur Introduction_to_Java Programming_Comprehensive_Version page 1193 
! vous devez avoir ajouter le "MySQL JDBC Driver" à votre projet, sous "Library"
 */
package eu.epfc.java1970.lesson30.databases;

// ! ne pas importer les librairies de mysql : 
//      nous travaillons avec le JDBC qui cache mysql
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 */
public class DemoInsert {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, UnsupportedEncodingException {
        Scanner clavier = new Scanner(new InputStreamReader(System.in, "UTF-8"));
        System.out.print("label ");
        String label = clavier.nextLine();
        System.out.print("prix ");
        String price = clavier.nextLine();
        System.out.print("unité ");
        String unit = clavier.nextLine();
        System.out.print("description ");
        String description = clavier.nextLine();
        insert(label, price, unit, description);
    }

    private static void insert(String label, String price, String unit, String description) throws ClassNotFoundException, SQLException {
        // validation du prix : est-ce bien un double
        try {
            double dPrice = Double.parseDouble(price);
        } catch (NumberFormatException ex) {
            System.out.println(price + " n'est pas un double");
            return;
        }

        Class.forName("com.mysql.jdbc.Driver");     // charge la classe Driver du pilote de mysql

        // crée une connection (la connection avec mysql) 
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/stock", 
                "root", 
                "root");

        // crée une statement : un objet pour gérer l'instruction SQL & demande à mysql de précompiler la requête SQL
        PreparedStatement preparedStatement
                = connection.prepareStatement("INSERT INTO produit VALUES(?, ?, ?, ?)");

        // injecte les données
        preparedStatement.setString(1, label);
        preparedStatement.setString(2, price);
        preparedStatement.setString(3, unit);
        preparedStatement.setString(4, description);

        // demande à mysql d'exécuter la requête SQL
        // et retourne un resultSet : un ensemble de résultats,
        // cet objet sert à récupérer les résultats de la requête SQL
        int insertedRows = preparedStatement.executeUpdate();   // executeUpdate !!! (pas executeQuery)

        System.out.println(insertedRows + " lignes insérées");
    }
}
