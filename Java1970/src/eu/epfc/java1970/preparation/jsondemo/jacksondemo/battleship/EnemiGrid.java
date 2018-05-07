package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

import java.util.ArrayList;

public class EnemiGrid extends BattleGrid {

    public EnemiGrid() {
    }

    
    public EnemiGrid(int size) {
        super(size);
    }
    
    void createShips(ArrayList<Ship> ships) {
        // should be implemented through a deep clone
        for (Ship ship : ships) {
            Ship myShip = new Ship(ship.getType(), ship.getOrientation(), ship.getX(), ship.getY());
            this.ships.add(myShip);
        }
    }
}
