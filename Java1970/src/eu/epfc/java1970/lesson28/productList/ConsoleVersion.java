/*
 */
package eu.epfc.java1970.lesson28.productList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Console version of the application
 */
public class ConsoleVersion {

    static Scanner keyboard = new Scanner(System.in, java.nio.charset.StandardCharsets.UTF_8.name());
    static ArrayList<Product> products = new ArrayList<>();
    static String fileName = null;

    public static void main(String[] args) {
        System.out.println("Ouvre l'application Products");
        mainMenu();
        System.out.println("Ferme l'application Products");
    }

    /**
     * Menu principal de l'application
     */
    private static void mainMenu() {
        boolean next = true;
        do {
            System.out.println("\n");
            showProducts();
            System.out.println("Choissisez entre les commandes suivantes");
            System.out.println("\tA pour ajouter un produit");
            if (products.size() > 0) {
                System.out.println("\tU pour mettre à jour un produit");
                System.out.println("\tD pour supprimer un produit");
            }
            System.out.println("\tI pour importer un fichier csv");
            System.out.println("\tE pour exporter la liste sur un fichier");
            System.out.println("\tQ pour quitter le programme");
            String cmd = keyboard.nextLine();
            switch (cmd) {
                case "A":
                    addProduct();
                    break;
                case "U":
                    updateProduct();
                    break;
                case "D":
                    deleteProduct();
                    break;
                case "I":
                    importListFromFile();
                    break;
                case "E":
                    exportListOnFile();
                    break;
                case "Q":
                    next = false;
                    break;
                default:
                    System.out.println("La commande que vous avez tapée " + cmd + " , n'est pas supportée");
                    System.out.println("Veuillez taper une commande correcte");
            }
        } while (next);
    }

    private static Product parseLine(String line) throws NumberFormatException {
        String[] cells = line.split(";");
        for (String cell : cells) {
            cell = cell.trim(); // enlève les espaces début é fin
        }
        Double price;
        price = Double.parseDouble(cells[1]);
        return new Product(cells[0], price, cells[2], cells[3]);
    }

    /**
     * Affiche les produits de la liste
     */
    private static void showProducts() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("" + i + ": " + getProductLine(products.get(i), " - "));
        }
    }

    /**
     * ajoute un produit à la liste
     */
    private static void addProduct() {
        System.out.print("Label: ");
        String label = keyboard.nextLine();
        double prix = readDouble("Prix: ");
        System.out.print("Unité: ");
        String unit = keyboard.nextLine();
        System.out.print("Description: ");
        String description = keyboard.nextLine();
        Product product = new Product(label, prix, unit, description);  // crée l'objet :Produit
        products.add(product);                                          // ajoute le nouveau produit à la liste
    }

    /**
     * Lit un double à partir du clavier
     *
     * @param message : à afficher
     * @return le double tapé par l'utilisateur
     */
    private static double readDouble(String message) {
        while (true) {                          // tant qu'il n'y a pas de double
            System.out.print(message);
            String read = keyboard.nextLine();      // saisie de l'utilisateur
            try {                                   // essaie de convertir en double
                return Double.valueOf(read);
            } catch (NumberFormatException ex) {    // capture l'exception si ce n'est pas un double
                System.out.println("Veuillez introduire un nombre");
            }
        }
    }

    /**
     * Lit un entier à partir du clavier
     *
     * @return l'entier
     */
    private static int readInt(String message) {
        while (true) {
            System.out.print(message);
            String read = keyboard.nextLine();
            try {
                return Integer.valueOf(read);
            } catch (NumberFormatException ex) {
                System.err.println("Veuillez introduire un entier");
            }
        }
    }

    /**
     * Modifie un produit
     */
    private static void updateProduct() {
        int index = readIndex("Veuillez introduire l'index: ");
        Product product = new Product(products.get(index));        // fait une copie du produit
        while (true) {
            System.out.println("1. Label : " + product.getLabel());
            System.out.println("2. Prix : " + product.getPrice());
            System.out.println("3. Unité : " + product.getUnit());
            System.out.println("4. Description : " + product.getDescription());
            System.out.println("Tapez le numéro du champs que vous voulez éditer");
            System.out.println("Tapez S pour sauver");
            System.out.println("Tapez C pour annuler");
            String cmd = keyboard.nextLine();
            switch (cmd) {
                case "1":
                    product.setLabel(readString("Label: "));
                    break;
                case "2":
                    product.setPrice(readDouble("Prix: "));
                    break;
                case "3":
                    product.setUnit(readString("Unité: "));
                    break;
                case "4":
                    product.setDescription(readString("Description: "));
                    break;
                case "S":
                    products.set(index, product);
                    return;
                case "C":
                    return;
                default:
                    System.out.println("Veuillez introduire une commande correcte");
            }
        }

    }

    /**
     * Lit un index à partir du clavier
     *
     * @param message à afficher
     * @return l'index
     */
    private static int readIndex(String message) {
        while (true) {
            int index = readInt(message);
            if (index >= 0 && index < products.size()) {
                return index;
            } else {
                System.out.println("Veuillez introduire un index entre 0 et " + products.size());
            }
        }
    }

    /**
     * Lit une chaîne de caractères à partir du clavier
     *
     * @param veuillez_introduire_le_label_
     * @return la string
     */
    private static String readString(String message) {
        System.out.println(message);
        return keyboard.nextLine();
    }

    /**
     * Supprime un produit
     */
    private static void deleteProduct() {
        int index = readIndex("Tapez l'index du produit à supprimer: ");
        Product product = products.get(index);
        System.out.println(getProductLine(product, " - "));
        System.out.print("Etes-vous sur de vouloir supprimer ce produit? (Y/N) ");
        String cmd = keyboard.nextLine();
        if (cmd.toUpperCase().equals("Y")) {
            products.remove(index);
            System.out.println("Le produit a été supprimé");
        } else {
            System.out.println("Opération annulée");
        }
    }

    /**
     * Export la liste sur un fichier
     */
    private static void exportListOnFile() {
        System.out.print("Nom de fichier: ");
        fileName = keyboard.nextLine();
        try (PrintWriter file = new PrintWriter(fileName, StandardCharsets.UTF_8.name())) {
            file.println(getProductTitles("; "));
            products.forEach((product) -> {
                file.println(getProductLine(product, "; "));
            });
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            Logger.getLogger(ConsoleVersion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Charge un fichier
     */
    private static void importListFromFile() {
        System.out.print("Nom de fichier: ");
        fileName = keyboard.nextLine();
        try (Scanner file = new Scanner(new File(fileName), java.nio.charset.StandardCharsets.UTF_8.name())) {
            if (file.hasNext()) {
                file.nextLine(); // read titles
            }
            while (file.hasNext()) {
                Product product = parseLine(file.nextLine());
                products.add(product);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ConsoleVersion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static String getProductLine(Product product, String separator) {
        String strPrice = Double.toString(product.getPrice());
        return String.join(separator,
                product.getLabel(),
                strPrice,
                product.getUnit(),
                product.getDescription()
        );
    }

    private static String getProductTitles(String separator) {
        return String.join(separator, "Label", "Prix", "Unité", "Description");
    }

}
