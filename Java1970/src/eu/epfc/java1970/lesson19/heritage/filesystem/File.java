
package eu.epfc.java1970.lesson19.heritage.filesystem;

/**
 *
 * @author jedepaepe
 */
public class File extends Node {
    double size = 0;

    public File(String name, double size) {
        super(name);
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" + "size=" + size + ", name=" + name + '}';
    }
    
}
