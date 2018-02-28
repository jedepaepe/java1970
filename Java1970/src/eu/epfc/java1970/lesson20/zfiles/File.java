package eu.epfc.java1970.lesson20.zfiles;

/**
 * A File in the file system
 * File hérite de Node
 */
public class File extends Node {
    
    int size;

    public File(String name, Directory parent, int size) {
        super(name, parent);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "File{" + super.toString() +  " - size=" + size + '}';
    }
    
}
