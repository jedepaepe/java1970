/*
https://moodle.epfc.eu/mod/page/view.php?id=25986 
*/
package eu.epfc.java1970.lesson25.battleship.model;

/**
 1.1. attributs

String name

int: size

1.2 méthodes

ShipType(int size)
ShipType(int size, String name)

getter
 */
public class ShipType {
    private String name;
    private final int size;

    public ShipType(int size) {
        this.size = size;
    }

    public ShipType(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    
    
    
    
}













