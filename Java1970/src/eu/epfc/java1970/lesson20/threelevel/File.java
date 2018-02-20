package eu.epfc.java1970.lesson20.threelevel;

/**
 *
 * @author jedepaepe
 */
public class File extends Node {
    int size;

    public File(String color, String name, int size) {
        super(color, name);
        this.size = size;
    }
    
    public static void main(String[] args) {
        File f = new File("red", "text.txt", 10);
    }
    
}
