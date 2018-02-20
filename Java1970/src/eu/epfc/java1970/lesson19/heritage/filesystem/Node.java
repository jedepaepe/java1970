package eu.epfc.java1970.lesson19.heritage.filesystem;

/**
 *
 * @author jedepaepe
 */
public abstract class Node {
    String name;

/* correcte mais on n'en veut pas pour des raisons designs    
    public Node() {
        System.out.println("Contructeur par défault de Node");
    }
    */
    
    // on veut imposer l'initialisation de "name" au niveau Node
    public Node(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" + "nom=" + name + '}';
    }
    
}
