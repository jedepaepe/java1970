package eu.epfc.java1970.lesson27.correction;

// https://moodle.epfc.eu/mod/page/view.php?id=25986

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonObjectBuilder;

public class ShipType {
    private String name;
    private int size;

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
    
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File("ship_type"), new ShipType("test", 10));
        } catch (IOException ex) {
            Logger.getLogger(ShipType.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
