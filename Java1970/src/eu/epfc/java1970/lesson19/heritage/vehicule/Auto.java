package eu.epfc.java1970.lesson19.heritage.vehicule;

/**
 *
 * @author jedepaepe
 */
public class Auto extends Vehicule {
    double puissance;
    boolean diesel = false;
    
    public double getCO2Emission() {
        return 10;
    }
    
    public void faireLePlain(double quantite) {
        System.out.println("La voiture " + name + " fait le plein de " + quantite + " littres");
    }
}
