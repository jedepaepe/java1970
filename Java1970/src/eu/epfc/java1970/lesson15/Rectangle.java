package eu.epfc.java1970.lesson15;

/**
 *
 * @author jedepaepe
 */
public class Rectangle {
    double height;  // la hauteur du rectangle
    double width;   // la largeur du rectangle
    
    /** 
     * constructeur sans arguement
     * nécessaire pour pouvoir instancier simplement un Rectangle:
     * Rectangle r = new Rectangle();
     */
    Rectangle() {
    }

    /**
     * constructeur avec arguments "naturels" : la largeur et la hauteur
     * nécessaire pour instancier le Rectangle en assignant directement les attibuts:
     * Rectangle r = new Rectangle(10, 20);
    */
    Rectangle(double largeur, double hauteur) {
        width = largeur;
        height = hauteur;
    }
    
    /**
     * constructeur avec arguments "non naturels" : un tableau de double
     * ce constructeur est donné uniquement pour illustrer le fait qu'on peut définir beaucoup de constructeurs,
     * ce constructeur est une mauvaise idée car:
     *   1) il n'indique pas explicitement que la hauteur est le premier élément de input et que la largeur est le second élément
     *   2) il crash si input.length < 2
    */
    Rectangle(double input[]) {
        height = input[0];
        width = input[1];
    }

    /**
     * constructeur avec arguements "non naturels" : un tableau de String
     * ce constructeur est donné uniquement pour illustrer le fait qu'on peut définir beaucoup de constructeurs,
     * ce constructeur est une mauvaise idée car:
     *   1) il n'indique pas explicitement que la hauteur est le premier élément de input et que la largeur est le second élément
     *   2) il crash si input.length < 2
     */
    Rectangle(String[] input) {
        height = Double.valueOf(input[0]);
        width = Double.valueOf(input[1]);
    }
    
    /**
     * retourne l'aire du rectangle
     */
    double getArea() {
        return height * width;
    }
    
    /**
     * retourne le périmètre du rectangle
     */
    double getPerimeter() {
        return 2 * (height + width);
    }
    
    /**
     * code de test pour la classe Rectangle
     * ce code devrait être dans une autre classe, par exemple DemoRectangle
     * car il n'est pas élégant de mélanger du code "business" (classe Rectangle) avec du code de test/demo (méthode main)
     */
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        r1.height = 10;
        r1.width = 10;
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        
    }
    
}
