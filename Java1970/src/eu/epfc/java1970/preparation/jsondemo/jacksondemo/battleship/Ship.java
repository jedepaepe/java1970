package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

public class Ship extends GridPoint {
    public enum Orientation {
        HORIZONTAL,
        VERTICAL
        }
    
    private ShipType type;
    private Orientation orientation;

    public Ship() {
    }
    
    public Ship(int x, int y) {
        super(x, y);
    }

    public Ship(ShipType type, Orientation orientation, int x, int y) {
        super(x, y);
        this.type = type;
        this.orientation = orientation;
    }

    
    public ShipType getType() {
        return type;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setType(ShipType type) {
        this.type = type;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

}
