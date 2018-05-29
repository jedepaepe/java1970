/*
Exercice de la leçon 30 (https://moodle.epfc.eu/mod/page/view.php?id=27187)
Gérer le contenu de la table produit en ligne de commande

Remarques:
1) Ce code vise la simplicité syntaxique et de design. En conséquence, il n'est pas factorisé.
2) Ce code n'est utilisable qu'avec des tables contenant peu d'enregistrements (manque les outils de recherches, filtrages)

 */
package eu.epfc.java1970.lesson30.databases;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Products {

    /**
     * connection avec la DB
     */
    static Connection connection;

    /**
     * clavier pour les entrées de l'utilisateur
     */
    static Scanner keyboard;

    public static void main(String[] args) throws UnsupportedEncodingException {
//        System.setOut(new PrintStream(System.out, true, "ibm850"));
        try {
            initConnection();
            initKeyboard();
            boolean next = true;
            while (next) {
                int nrRow = listAllProducts();
                System.out.println("");
                showCommands();
                String command = keyboard.nextLine();
                switch (command) {
                    case "I":
                        insertProduct();
                        break;
                    case "M":
                        updateProduct(nrRow);
                        break;
                    case "S":
                        deleteProduct(nrRow);
                        break;
                    case "Q":
                        next = false;
                        break;
                    default:
                        System.out.println(command + " n'est pas connue\n");
                        showCommands();
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Sorry, l'application va s'arrêter");
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Products.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        System.out.println("Bye bye");
    }

    /**
     * initialise la connection
     */
    private static void initConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/stock?useUnicode=true&amp;amp;characterEncoding=UTF-8", /*on a ajouté l'encodage UTF-8 pour la DB*/
                "root",
                "root");
    }

    /**
     * liste tous les produits et ajoute un index pour les désigner
     *
     * @throws SQLException
     */
    private static int listAllProducts() throws SQLException {
        System.out.println("");
        int nrRow = 0;
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM produit");
            System.out.printf("%5s | %12s | %8s | %8s | %24s\n", "index", "label", "price", "unit", "description");
            while (resultSet.next()) {
                String label = resultSet.getString(1);
                String price = resultSet.getString(2);
                String unit = resultSet.getString(3);
                String description = resultSet.getString(4);
                System.out.printf("%5d | %12s | %8s | %8s | %24s\n", nrRow, label, price, unit, description);
                nrRow++;
            }
        }
        if (nrRow == 0) {
            System.out.println("Aucun produit dans la DB");
        }
        System.out.println("");
        return nrRow;
    }

    /**
     * Insére un nouveau record dans la DB
     *
     * @throws SQLException
     */
    private static void insertProduct() throws SQLException {
        System.out.print("Label: ");
        String label = keyboard.nextLine();
        System.out.print("Prix: ");
        String prix = keyboard.nextLine();
        System.out.print("Unité: ");
        String unit = keyboard.nextLine();
        System.out.print("Description: ");
        String description = keyboard.nextLine();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO produit VALUES (?,?,?,?)");
        preparedStatement.setString(1, label);
        preparedStatement.setString(2, prix);
        preparedStatement.setString(3, unit);
        preparedStatement.setString(4, description);
        preparedStatement.executeUpdate();
    }

    /**
     * Met à jour un produit dans la DB
     *
     * @throws SQLException
     */
    private static void updateProduct(int nrRow) throws SQLException {

        System.out.print("Sélectionnez l'index du produit à mettre à jour 0-" + (nrRow - 1) + " : ");
        int index = keyboard.nextInt();
        keyboard.nextLine();    // lit le retour de ligne

        // Lire le record dans la DB (un record à l'index "?")
        PreparedStatement getStatement = connection.prepareStatement("SELECT * FROM produit LIMIT ?,1");
        getStatement.setInt(1, index);
        ResultSet resultSet = getStatement.executeQuery();
        if (resultSet.first()) {
            String oldLabel = resultSet.getString(1);   // récupérer l'ancien index

            // demander les nouvelles valeurs
            System.out.print("Label: ");
            String label = keyboard.nextLine();
            System.out.print("Prix: ");
            String price = keyboard.nextLine();
            System.out.print("Unité: ");
            String unit = keyboard.nextLine();
            System.out.print("Description: ");
            String description = keyboard.nextLine();

            PreparedStatement updateStatement = connection.prepareStatement(
                    "UPDATE produit SET label=?, price=?, unit=?, description=? WHERE label=?");
            updateStatement.setString(1, label);
            updateStatement.setString(2, price);
            updateStatement.setString(3, unit);
            updateStatement.setString(4, description);
            updateStatement.setString(5, oldLabel);
            updateStatement.executeUpdate();
        } else {
            System.out.println("L'enregistrement n'a pas été trouvé");
        }

    }

    /**
     * Supprime un produit
     *
     * @param nrRow
     * @throws SQLException
     */
    private static void deleteProduct(int nrRow) throws SQLException {
        System.out.print("Sélectionnez l'index du produit à mettre à jour 0-" + (nrRow - 1) + " : ");
        int index = keyboard.nextInt();
        keyboard.nextLine();    // lit le retour de ligne

        // Lire le record dans la DB (un record à l'index "?")
        PreparedStatement getStatement = connection.prepareStatement("SELECT * FROM produit LIMIT ?,1");
        getStatement.setInt(1, index);
        ResultSet resultSet = getStatement.executeQuery();
        if (resultSet.first()) {
            String oldLabel = resultSet.getString(1);   // récupérer l'ancien index

            // supprimer le record
            PreparedStatement updateStatement = connection.prepareStatement(
                    "DELETE FROM produit WHERE label=?");
            updateStatement.setString(1, oldLabel);
            updateStatement.executeUpdate();
        } else {
            System.out.println("L'enregistrement n'a pas été trouvé");
        }
    }

    private static void showCommands() {
        System.out.println("Veuillez taper un des caractères suivants [L,I,U,D,Q]");
        System.out.println("I : pour Insérer un nouveau produit");
        System.out.println("M : pour Modifier un produit");
        System.out.println("S : pour Supprimer un produit");
        System.out.println("Q : pour Quitter l'application");
    }

    private static void initKeyboard() {
        // il n'y a pas moyen de savoir quel est l'encodage de la console
        // https://stackoverflow.com/questions/6172972/how-to-get-console-charset?utm_medium=organic&utm_source=google_rich_qa&utm_campaign=google_rich_qa
        // en général la console windows est en IBM850
        // on peut forcer le scanner à utiliser celui-ci
        keyboard = new Scanner(System.in, "ibm850");
    }

}
