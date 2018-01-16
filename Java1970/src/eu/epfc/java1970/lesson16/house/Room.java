package eu.epfc.java1970.lesson16.house;

public class Room {
    public String name;     // nom de la pièce
    public double length;   // longueur de la pièce
    public double width;    // largeur de la pièce

    /**
     * Constructeur de la pièce
     * @param name : nom de la pièce
     * @param length : longueur de la pièce
     * @param width : largeur de la pièce
     */
    public Room(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
    
    /**
     * 
     * @return l'aire de la pièce
     */
    public double getArea() {
        return length * width;
    }
    
}
