/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.hermisilla;

/*
 * EXERCISE 1
 */
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamenJuinItsasoExercise1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // #prof# manque la boucle do{ ... } while
        String phrase;
        System.out.print("Phrase:  ");
        phrase = input.nextLine();

        System.out.print("Action (M-m-C-n-w-s-h-Q):  ");

        String choix = input.next();

        switch (choix) {
            case "M":
                phrase = phrase.toUpperCase();
                System.out.println(phrase);
                break;
            case "m":
                phrase = phrase.toLowerCase();
                System.out.println(phrase);
                break;
            case "C":
// #prof# ligne vide mal venue -1
                char[] chars = phrase.toCharArray();    // #prof# mieux dans une fonction
                chars[0] = Character.toUpperCase(chars[0]);
                for (int x = 1; x < chars.length; x++) {
                    if (chars[x - 1] == ' ') {
                        chars[x] = Character.toUpperCase(chars[x]);
                    }
                }
                String str2 = new String(chars);
                System.out.println(str2);

                break;
            case "n":
                int contar = phrase.length();   // #prof# inutilement compliqué -1
                System.out.println("le nombre de caracters  " + contar);
                break;
            case "w":
                StringTokenizer st = new StringTokenizer(phrase, " "); // #prof# très élégant +1
                int n = st.countTokens();
                System.out.println("le nombre de mot est  " + n);

                break;
            case "s":
                System.out.print("Pattern:   ");    // #prof# mieux dans une fonction
                String pattern1 = input.next();
                Pattern pattern = Pattern.compile(pattern1);
                Matcher matcher = pattern.matcher(phrase);
                int count = 0;
                while (matcher.find()) {
                    count++;
                }
                System.out.println(count);
                break;
            case "h":
                System.out.println(" M: mettre en majuscule"    // #prof# mieux dans une fonction
                        + "m: mettre minuscules"    // #prof# manque le retour à la ligne -1
                        + "C: capitaliser les mots"
                        + "n: afficher le nombre de caracteres"
                        + "w: afficher le nombre de mots"
                        + "s: compter nombre occurence un motif"
                        + "h: afficer l´aide"
                        + "Q: quitter l´application ");
                break;
            case "Q":
                System.out.println("  Good bye  ");
                break;
            default:
                System.out.println("Entrée incorrecte");

        }
    }
}
