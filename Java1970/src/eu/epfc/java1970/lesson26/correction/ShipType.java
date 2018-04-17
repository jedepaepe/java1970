package eu.epfc.java1970.lesson26.correction;

// https://moodle.epfc.eu/mod/page/view.php?id=25986
public class ShipType {
    private String name;
    private int size;

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
