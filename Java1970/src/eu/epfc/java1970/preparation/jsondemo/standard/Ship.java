package eu.epfc.java1970.preparation.jsondemo.standard;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

import javax.json.JsonObjectBuilder;

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

    public int getOrientationAsInt() {
        return (orientation.HORIZONTAL == orientation) ? 1 : 2;
    }

    public JsonObjectBuilder getJsonObjectBuilder() {
        return super.getJsonObjectBuilder()
                .add("type", type.getJsonObjectBuilder())
                .add("orientation", getOrientationAsInt());  
    }
    
}
