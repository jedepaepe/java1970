package eu.epfc.java1970.lesson19.heritage.filesystem;

/**
 *
 * @author jedepaepe
 */
public class DemoFS {

    public static void main(String[] args) {
        File file = new File("readme.txt", 100_000_000);
        
        Directory directory = new Directory("root");
        
        // démonstration de l'héritage
        Node[] list = {
            file,       // on y met un File
            directory   // et un Directory
        };    
        
        // on parcoure la liste
        for (Node node : list) {
            System.out.println(node.toString());    // polymorphisme
        }
    }

}






