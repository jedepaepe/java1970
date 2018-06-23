package solution;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * Créez une application en ligne de commande qui: .) demande d'écrire une
 * phrase .) demande le traitement à faire sur cette ligne, avec les
 * possibilités suivantes: .) mettre en majuscules .) mettre en minuscules .)
 * mettre en capitalisé (première lettre de chaque mot en majuscule) .) compter
 * le nombre de caractères .) compter le nombre de mot (on considère que les
 * mots sont séparé par des espaces) .) rechercher un mot et donner le nombre
 * d'occurences d'un motif (l'application doit demander le motif (pattern) !) .)
 * quitter l'application En option, faite la même chose mais avec un fichier =>
 * .) demande le nom du fichier .) demande le traitement à faire sur le fichier
 * .) idem
 */
public class ExamenSe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cmd = "Q";
        String phrase = "";
        do {
            System.out.print("Phrase: ");
            phrase = input.nextLine();
            System.out.print("Action: ");
            cmd = input.nextLine();
            switch (cmd) {
                case "M":
                case "majuscule":
                    System.out.println(phrase.toUpperCase());
                    break;
                case "m":
                    System.out.println(phrase.toLowerCase());
                    break;
                case "C":
                case "capitalise":
                    System.out.println(capitalize(phrase));
                    break;
                case "n":
                case "compter":
                    System.out.println(phrase.length());
                    break;
                case "w":
                case "word":
                case "mot":
                    System.out.println(phrase.split(" ").length);
                    break;
                case "s":
                case "search":
                case "recherche":
                    System.out.print("Motif(pattern): ");
                    String pattern = input.nextLine();
                    System.out.println(search(phrase, pattern).length);
                    break;
                case "h":
                case "H":
                case "aide":
                    System.out.println(getHelp());
                case "Q":
                case "quitter":
                    break;
                default:
                    System.out.println("La commande que vous avez tapé '"
                            + cmd
                            + " n'est pas supportée par l'application\n"
                            + "Les commandes supportées sont"
                    );
                    System.out.println(getHelp());
            }
        } while (!cmd.equals("Q"));
        System.out.println("Bye bye");
    }

    private static String getHelp() {
        StringBuilder help = new StringBuilder();
        help.append("M : pour mettre en majuscules\n");
        help.append("m : pour mettre en minuscules\n");
        help.append("C : pour capitaliser les mots\n");
        help.append("n : pour afficher le nombre de caractères\n");
        help.append("w : pour afficher le nombre de mots\n");
        help.append("s : pour compter le nombre d'occurence d'un motif\n");
        help.append("h : pour afficher l'aide\n");
        help.append("Q : pour quitter l'application");
        return help.toString();
    }

    private static String capitalize(String phrase) {
        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
        return String.join(" ", words);
    }

    private static int[] search(String phrase, String pattern) {
        int lastIndex = 0;
        ArrayList<Integer> indexes = new ArrayList();
        while (lastIndex != -1) {
            lastIndex = phrase.indexOf(pattern, lastIndex);
            if (lastIndex != -1) {
                indexes.add(lastIndex);
                lastIndex += pattern.length();
            }
        }
        /* old fashion 
        int[] result = new int[indexes.size()];
        for(int i=0; i<result.length; i++) {
            result[i] = indexes.get(i);
        }
         */
        // java 8
        int[] result = indexes.stream().mapToInt(i -> i).toArray();
        return result;
    }

}
