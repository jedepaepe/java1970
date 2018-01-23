/*
 * 
 */
package eu.epfc.java1970.lesson17.polygone;

/**
 *
 * @author jedepaepe
 */
public class Polygone {

    Side[] sideList;     // référence la liste de coté (initialisée à null)

    public Polygone(int sideNr) {   // sideNr : nombre de côtés du polygone
        this.sideList = new Side[sideNr];   // crée la nouvelle liste
    }

    @Override
    public String toString() {
        // changer le code pour afficher tous les côtés
        /*
        Polygone{
            0 => Side{x=0, y=0}
            1 => Side{x=1, y=0}
            2 => Side{x=0, y=1}
        }
         */
        
        // devrait utiliser StringBuilder à la place de String
        String string = "Polygone{sideList=\n";
        for (Side side : sideList) {
            string += ( "\t" + side.toString() + "\n");
        }
        string += "}";
        return string;
    }

    public int getSideNr() {
        // écrire le code
        return 0;
    }

    public double perimeter() {
        // complexe
        // SUMi sqrt( ( x_i+1 - x_i)^2 + (y_i+1 - y_i)^2 )
        return 0;
    }

    public Side center() {
        // centre_x = SUM(x) / getSideNr
        // centre_y = SUM(y) / getSideNr
        return new Side(0, 0);
    }

}
