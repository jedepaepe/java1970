package eu.epfc.java1970.lesson20.zfiles;

/**
 * A node is an element of the file system
 * This is an abstract class : it can not be instantiated
 * => cette classe est utile uniquement si d'autres classes en hérite
 * dans notre cas: File & Directory
 */
public abstract class Node {
    private String name;
    private Directory parent;

    public Node(String name, Directory parent) {
        this.name = name;
        this.parent = parent;
    }
    
    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Node{" + "name=" + name + '}';
    }
    
}
