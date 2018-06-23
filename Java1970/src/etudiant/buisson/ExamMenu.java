/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.buisson;



import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;    // #prof# import inutile -1
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;    // #prof# import inutile -1


/*
* Créez une application en ligne de commandes qui: 
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
En plus * .) imaginer une solution plus élégante pour la phrase, 
car dans l'implémentation proposée, il faut toujours réintroduire la phrase
 */
public class ExamMenu {

    public static void main(String args[]) {
        String phrase;
        char choix; // #prof# plus simple avec un String
        Scanner lettre = new Scanner(System.in);
        do {
            System.out.println("Entrez une phrase");
            phrase = lecturePhrase();   // sur-engineering (fonction pas nécessaire)
            affichageMenu();
            choix = lettre.next().charAt(0);
            switch (choix) {
                case 'm':
                    minuscule(phrase);
                    break;
                case 'M':
                    majuscule(phrase);
                    break;
                case 'l':
                    nombreLettres(phrase);
                    break;
                case 'o':
                    nombreMots(phrase);
                    break;
                case 'h':
                    affichageMenu();
                    break;
            }

        } while (choix != 'Q');
    }

    /* methode lecture phrase Paramère : rien - Retour : String*/
    public static String lecturePhrase() {
        Scanner scanner = new Scanner(System.in);  // #prof# multi-instanciation du scanne -1
        String phraseLue = scanner.nextLine();
        /* scanner.useLocale(Locale.FRANCE );*/
 /* System.out.println(phraseLue);*/
        return phraseLue;
    }

    /*Affichage du menu complet : pas de paramètre, par de return*/
    public static void affichageMenu() {
        System.out.println("M : Mettre en majuscule ");
        System.out.println("m : Mettre en minuscule ");
        System.out.println("l : nombre de lettres ");
        System.out.println("o : nombre de mots");
        System.out.println("Q : Quitter l'application");
        System.out.println("");
        return;     // #prof# return inutile

    }

    /* methodes de chaque menus : paramètre deux valeurs, une string pour la phrase, et une lettre
     return : pas de return*/
    public static void majuscule(String phrase) {
        String phraseTransformee = toUpperCase(phrase);
        System.out.println(phraseTransformee);
    }

    public static void minuscule(String phrase) {
        String phraseTransformee = toLowerCase(phrase);
        System.out.println(phraseTransformee);
    }

    public static void nombreLettres(String phrase) {   // #prof# trop compliqué (utilisez length) -1
        String phraseTransformee = phrase.replace(" ", "");
        System.out.println(phraseTransformee.length());
    }

    /*Calcul du nombre de mots*/
    public static void nombreMots(String phrase) {
        int size = phrase.length();
        int counter = 0;
        for (int i = 0; i < size - 1; i++) {
            if ((" ".equals(phrase.substring(i, i + 1)))
                    || ("'".equals(phrase.substring(i, i + 1)))) {
                counter += 1;
            }
        }
        System.out.println(counter + 1);

    }

    public static void majusculePremieresLettres(String phrase) {
        System.out.println(phrase);

    }
}
