package eu.epfc.java1970.lesson19.heritage.filesystem;

/**
 *
 * @author jedepaepe
 */
public class DemoFS {

    public static void main(String[] args) {
        File file = new File();
        file.name = "readme.txt";
        file.size = 100_000_000;
        
        Directory directory = new Directory();
        directory.name = "root";
        
        Node[] list = {file, directory};
        
        for (Node node : list) {
            System.out.println(node.toString());
        }
    }

}
