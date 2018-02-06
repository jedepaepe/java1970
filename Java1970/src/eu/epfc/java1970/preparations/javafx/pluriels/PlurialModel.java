package eu.epfc.java1970.preparations.javafx.pluriels;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jedepaepe
 */
public class PlurialModel {
    Map<String, String> list = new HashMap<>();

    public PlurialModel() {
        list.put("cheval", "chevaux");
        list.put("oeil", "yeux");
    }
    
    public String getPlurial(String singular) {
        return list.get(singular);
    }
    
}
