package eu.epfc.java1970.lesson27.correction;

// https://moodle.epfc.eu/mod/page/view.php?id=25986
public class Ship extends GridPoint {
    public enum Orientation {
        HORIZONTAL,
        VERTICAL
        }
    
    private ShipType type;
    private Orientation orientation;

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

}
