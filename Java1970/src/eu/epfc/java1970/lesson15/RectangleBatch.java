package eu.epfc.java1970.lesson15;

/**
 * Classe pour illustrer l'utilisateur de la classe Rectangle
 * c'est la version "ligne de commande" de RectangleUI
 * la hauteur et la largeur sont lues à partir de la ligne de commande:
 *      java RectangleBatch 10 2
 * affiche l'aire et le périmètre d'un rectangle de 10 (hauteur) sur 2 (largeur)
 */
public class RectangleBatch {
    public static void main(String[] args) {        
        Rectangle rect = new Rectangle();
        rect.height = Double.valueOf(args[0]);
        rect.width = Double.valueOf(args[1]);
        System.out.println("Aire: " + rect.getArea());
        System.out.println("Perimetre: " + rect.getPerimeter());
        
        /////////////////////////////
        
        // exemple d'utilisation du constructeur Rectangle(String[] args)
        rect = new Rectangle(args);
        
        // exemple d'utilisation du constructeur Rectangle(double[] input)
        double[] input = new double[2];
        input[0] = 10;
        input[1] = 10;
        rect = new Rectangle(input);
    }
}
