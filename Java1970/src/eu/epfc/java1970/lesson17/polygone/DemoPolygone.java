/*
 * 
 */
package eu.epfc.java1970.lesson17.polygone;

/**
 *
 * @author jedepaepe
 */
public class DemoPolygone {
    public static void main(String[] args) {
        Polygone triangle = new Polygone(3);    // crée le polygone
        
        Side cote0 = new Side(0, 0);    // crée le premier côté
        triangle.sideList[0] = cote0;   // assigne cote0 au premier élément de sideList
        
        Side cote1 = new Side(1, 0);    // crée le second côté
        triangle.sideList[1] = cote1;   // assigne ... au polygone
        
        Side cote2 = new Side(0, 1);    // troisième côté ...
        triangle.sideList[2] = cote2;
        
        System.out.println(triangle.toString());
        
        System.out.println("");
        cote1.x = 10000;
        System.out.println(triangle.toString());
        
        // non je veux -1
        System.out.println("");
        triangle.sideList[1].x = -1;
        System.out.println(cote1.toString());
    }
 
}
