package eu.epfc.java1970.preparation.jsondemo.standard;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

import eu.epfc.java1970.lesson27.correction.*;
// https://moodle.epfc.eu/mod/page/view.php?id=25986

public class FriendGrid extends BattleGrid {

    public FriendGrid(int size) {
        super(size);
    }
    
    void createShip(int size, Ship.Orientation orientation, int x, int y) {
        ShipType type = new ShipType(size);
        Ship ship = new Ship(type, orientation, x, y);
        ships.add(ship);
    }
    
}
