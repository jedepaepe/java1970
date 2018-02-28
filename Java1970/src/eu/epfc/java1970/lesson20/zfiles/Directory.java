package eu.epfc.java1970.lesson20.zfiles;

/**
 * La classe Directory représente un répertoire dans le filesystem
 */
public class Directory extends Node {
    
    public Directory(String name) {
        super(name);
    }
    
    public Directory(String name, Directory parent) {
        super(name, parent);
    }
    
    @Override
    public String toString() {
        return "Directory{" + super.toString() + '}';
    }    
    
}
