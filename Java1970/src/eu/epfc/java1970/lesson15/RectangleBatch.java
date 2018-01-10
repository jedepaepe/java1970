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
        Rectangle rect = new Rectangle();       // crée l'objet de type Rectangle, la variable rect contient la référence vers cet objet
        rect.height = Double.valueOf(args[0]);  // args[0] contient le premier argument de la ligne de commande, par ex: java eu.epfc.java1970.lesson15.Rectangle 1.0 2.0
                                                //  c'est un objet de type String, il ne peut pas être assigné à la rect.height qui est un double
                                                //  Double.valueOf("1.0") convertit la String "1.0" en un double : 1.0
                                                //  rect.height = 1.0 assigne la valeur 1.0 à l'attribut "height" de rect
                                                //    (plus exactement l'attribut de l'objet de type Rectangle référencé par la variable "height")
        rect.width = Double.valueOf(args[1]);   // idem avec le deuxième argument de la ligne de commande
        System.out.println("Aire: " + rect.getArea());  // affiche l'aire
                                                        // rect.getArea() invoque la méthode getArea sur l'objet "rect"
                                                        //      (plus exactement sur l'objet référencé par la variable "rect"
                                                        // qui retourne l'aire du rectangle
        System.out.println("Perimetre: " + rect.getPerimeter());    // rect.getPerimeter() invoque la méthode getPerimeter sur l'objet "rect"
                                                                    // qui retourne le périmètre du rectangle
        
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
