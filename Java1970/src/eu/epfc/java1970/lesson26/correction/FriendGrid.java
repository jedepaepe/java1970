package eu.epfc.java1970.lesson26.correction;

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
