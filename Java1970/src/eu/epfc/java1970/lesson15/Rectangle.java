package eu.epfc.java1970.lesson15;

/**
 *
 * @author jedepaepe
 */
public class Rectangle {
    double height;
    double width;
    
    Rectangle() {
    }

    Rectangle(double largeur, double hauteur) {
        width = largeur;
        height = hauteur;
    }
    
    Rectangle(double input[]) {
        height = input[0];
        width = input[1];
    }
    
    Rectangle(String[] input) {
        height = Double.valueOf(input[0]);
        width = Double.valueOf(input[1]);
    }
    
    double getArea() {
        return height * width;
    }
    
    double getPerimeter() {
        return 2 * (height + width);
    }
    
    public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        r1.height = 10;
        r1.width = 10;
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        
    }
    
}
