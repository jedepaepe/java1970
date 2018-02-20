package eu.epfc.java1970.lesson20.threelevel;

/**
 * Node a pour mère Thing
 * et pour enfant File
 * @author jedepaepe
 */
public class Node extends Thing {
    String name;
    Node(String color, String name) {
        super(color);
        this.name = name;
    }
}
