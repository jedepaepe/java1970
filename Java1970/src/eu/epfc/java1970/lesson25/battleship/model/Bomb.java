/*
https://moodle.epfc.eu/mod/page/view.php?id=25986
 */
package eu.epfc.java1970.lesson25.battleship.model;

/**
(3) Créez la classe Bomb
3.1. Attributs

int x

int y

3.2. méthodes

Bomb(int x, int y)

getter
*/
public class Bomb {
    private int x;
    private int y;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
