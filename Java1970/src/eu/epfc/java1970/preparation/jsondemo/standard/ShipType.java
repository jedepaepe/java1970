package eu.epfc.java1970.preparation.jsondemo.standard;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

import javax.json.Json;
import javax.json.JsonObjectBuilder;

public class ShipType {
    private final String name;
    private final int size;

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
    
    public JsonObjectBuilder getJsonObjectBuilder() {
        return Json.createObjectBuilder()
                .add("name", name)
                .add("size", size);
    }
    
}
