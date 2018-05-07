package eu.epfc.java1970.preparation.jsondemo.jacksondemo.battleship;

// https://moodle.epfc.eu/mod/page/view.php?id=25986
public class ShipType {
    private String name;
    private int size;

    public ShipType() {
    }

    
    public ShipType(int size) {
        this.size = size;
        this.name = "bateau";
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

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
}
