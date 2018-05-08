/*
 */
package eu.epfc.java1970.preparations.fileDemo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 */
public class PrintWriterDemo {

    public static void main(String[] args) {
        ArrayList<Article> articles = new ArrayList<>();
        Scanner clavier = new Scanner(System.in);
        boolean next = true;
        do {
            System.out.println("Tapez");
            System.out.println("A pour ajouter un article");
            System.out.println("L pour lister les articles");
            System.out.println("Q pour quitter");
            String cmd = clavier.nextLine();
            switch (cmd) {
                case "A":
                    System.out.print("Dénomination: ");
                    String denomnination = clavier.nextLine();
                    System.out.print("Prix: ");
                    double prix = clavier.nextDouble();
                    clavier.nextLine();
                    System.out.print("Unité: ");
                    String unite = clavier.nextLine();
                    System.out.print("Description: ");
                    String description = clavier.nextLine();
                    articles.add(new Article(denomnination, prix, description, unite));
                    break;
                case "L":
                    articles.forEach((article) -> {
                        System.out.println(article);
                    });
                    break;
                case "Q":
                    next = false;
                    break;
                default:
                    System.out.println("Commande inconnue");
            }
        } while (next);
    }

}
