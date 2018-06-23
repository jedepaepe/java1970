/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.carvalho;

/*
 *  * Créez une application en ligne de commandes qui: 
.) demande d'écrire une phrase 
.) demande le traitement à faire sur cette phrase, avec les possibilités suivantes: 
.) mettre en majuscules 
.) mettre en minuscules 
.) mettre en capitalisé (première lettre de chaque mot en majuscule) 
.) compter le nombre de caractères 
.) compter le nombre de mot (on considère que les mots sont séparés par des espaces) 
.) rechercher un motif dans la phrase et donner le nombre d'occurrences d'un motif (l'application doit demander le motif (pattern) !) 
.) afficher l'aide
.) quitter l'application 
En plus:
 * .) imaginer une solution plus élégante pour la phrase, car dans l'implémentation proposée, il faut toujours réintroduire la phrase
 */

import java.util.Locale;    // #prof# import non utilisé -1
import java.util.Scanner;

public class QuestionJavaSE {

    public static void main(String[] args) {
       
        String choix;
        boolean teste = false;      // #prof# peu faire plus simple -1
        boolean choixAction=true;   // #prof# peu faire plus simple -1
        
        do {
        
        Scanner input = new Scanner(System.in); // #prof# non respect de l'indentation -1
        System.out.println("Phrase: ");
        String phrase = input.nextLine();

            do {    // #prof# boucle illogique -5
                 
                System.out.println("Action: ");
                String action = input.nextLine();
                
                if (action.equals("h")) {
                    
                    choixAction = false;
                }else System.out.println("Invalide caracter, tapez 'h' pour le menu");
                
                
            } while (choixAction);
           

        
            System.out.println("Tapez 1 mettre en majuscules"); // #prof# mieux dans une fonction -1
            System.out.println("Tapez 2 mettre en minuscules");
            System.out.println("Tapez 3 mettre en capitalisé");
            System.out.println("Tapez 4 compter le nombre de caractères");
            System.out.println("Tapez 5 compter le nombre de mot");
            System.out.println("Tapez 6 rechercher un motif dans la phrase et donner le nombre d'occurrences d'un motif");
            System.out.println("Tapez h afficher l'aide");
            System.out.println("Tapez Q pour Quitter");
           
           choix = input.next().toUpperCase(); // indépendant de la case (q => quitter)
            
           
            
            switch (choix) {
                case "1":   // #prof# commentaires seraient bien venus (1, 2, 3...)
// #prof# ligne vide mal venue -1
                    System.out.println(phrase.toUpperCase());
                    teste = true;
                    break;
                case "2":
                    System.out.println(phrase.toLowerCase());
                    teste = true;
                    break;
                case "3":
                    System.out.println(phrase.substring(0, 1).toUpperCase() + phrase.substring(1));
                    teste = true;
                    break;
                case "4":
                    System.out.println(phrase.length());
                    teste = true;
                    break;
                case "5":
                    teste = true;
                    break;
                case "6":
                teste = true;   // #prof# mauvaise indentation -1
                    break;
                case "h":
                    teste = true;
                    break;
                case "Q":
                    break;  // éviter le default
                default:
                    System.out.println("Choix incorrect, seuls 1, 2, 3, 4, 5, 6, h et Q sont permis");
            }
        } while (!choix.equals("Q") || teste);
        System.out.println("Goodbye");

    }

}
