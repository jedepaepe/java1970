package eu.epfc.java1970.lesson19.heritage.vehicule;

/**
 *
 * @author jedepaepe
 */
public class Vehicule {
    double weight;
    double lengh;
    double width;
    double height;
    double maxRate;
    String name;
    
    void star() {
        System.out.println("Le véhicule " + name + " a démarré");
    }
    
    void stop() {
        System.out.println("Le véhicule " + name + " s'est arrêté");
    }
    
    
}
