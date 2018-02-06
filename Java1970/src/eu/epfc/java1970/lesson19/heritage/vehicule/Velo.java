package eu.epfc.java1970.lesson19.heritage.vehicule;

/**
 *
 * @author jedepaepe
 */
public class Velo extends Vehicule {
    int nrVitesse = 5;
    int vitesseCourante = 1;
    
    public void changeVitesse(int vitesse) {
        if(vitesse <= nrVitesse) {
            System.out.println("Velo " + name + " a changé de la vitesse " + vitesseCourante + " à " + vitesse);
            vitesseCourante = vitesse;
        }
    }
}
