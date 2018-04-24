package eu.epfc.java1970.lesson27.correction;

// https://moodle.epfc.eu/mod/page/view.php?id=25986
public class Ship {
    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }
    
    private ShipType type;
    private Orientation orientation;
    private int x;
    private int y;

    public Ship(ShipType type, Orientation orientation, int x, int y) {
        this.type = type;
        this.orientation = orientation;
        this.x = x;
        this.y = y;
    }

    public ShipType getType() {
        return type;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
