/*
Démo sur l'encodage des caractères
http://illegalargumentexception.blogspot.be/2009/05/java-rough-guide-to-character-encoding.html
 */
package eu.epfc.java1970.lesson28.productList;

import java.nio.charset.Charset;
import java.util.Scanner;

/**
 *
 * @author FHA576
 */
public class DemoEncoding {
    public static void main(String[] args) {
        Charset charset = Charset.defaultCharset();
        System.out.println("Encodage par défault " + charset);
        System.out.println("Alias " + charset.aliases());
        System.out.println(System.getProperty("file.encoding"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Árpád");
        String s = scanner.nextLine();
        System.out.println(s);
        
    }
}
