/*
https://moodle.epfc.eu/mod/page/view.php?id=25986
 */
package eu.epfc.java1970.lesson25.battleship.model;

/**
 * (2) Créez la classe Ship 2.1 définir le type Orientation:
 *
 * public enum Orientation { HORIZONTAL, VERTICAL }
 *
 * 2.2 définir les attributs
 *
 * ShipType type
 *
 * int x
 *
 * int y
 *
 * Orientation orientation
 *
 * 2.3. les méthodes
 *
 * Ship(ShipType type, Orientation orientation, int x, int y)
 *
 * getter
 */
public class Ship {

    private final ShipType type;
    private final int x;
    private final int y;
    private final Orientation orientation;
    private final boolean touch[];
    

    public Ship(ShipType type, int x, int y, Orientation orientation) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        touch = new boolean[type.getSize()];
        for(int i=0; i<type.getSize(); i++) touch[i] = false;
    }

    public ShipType getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public FireResult fire(int x, int y) {
        boolean in = false;
        if (orientation == Orientation.HORIZONTAL) {
            for (int i = 0; i < getType().getSize(); i++) {
                if(x == (this.x+i) && y == this.y) {
                    touch[i] = true;
                    in = true;
                }
            }
        }
        else {
            for (int j = 0; j < getType().getSize(); j++) {
                if(x == this.x && y == (this.y+j)) {
                    touch[j] = true;
                    in = true;
                }
            }
        }
        if(in) {
            for(int i=0; i<getType().getSize(); i++) {
                if(!touch[i]) return FireResult.TOUCH;
            }
            return FireResult.SUNK;
        }
        return FireResult.WATER;
    }
    
}
