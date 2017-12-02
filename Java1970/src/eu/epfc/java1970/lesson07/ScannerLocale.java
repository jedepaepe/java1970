package eu.epfc.java1970.lesson07;
/*
Cet example résoud le bug:
Exception in thread "main" java.util.InputMismatchException
	at java.util.Scanner.throwFor(Scanner.java:864)
	at java.util.Scanner.next(Scanner.java:1485)
	at java.util.Scanner.nextDouble(Scanner.java:2413)
	at ScannerLocale.main(ScannerLocale.java:15)
C:\Users\jedepaepe\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1

lorsque l'utilisateur utilise la notation américaine pour un réel, par exemple:
8.3

C'est évidemment troublant car System.out.println(xxx) utilise la notation américaine des nombres
*/

import java.util.Locale;
import java.util.Scanner;

public class ScannerLocale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input doit utiliser les "locale" américaines:
        input.useLocale(Locale.US);
        double test = input.nextDouble();
        System.out.println(test);
    }
}
