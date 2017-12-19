package eu.epfc.java1970.lesson14.aCreateSimpleObject;

/**
 *
 * @author jedepaepe
 */
public class Car {
    String licensePlate;
    int year;
    String color;
    int km;
    String model;
    
    String getDescription() {
        String desc = "La voiture est :\n" +
                "\tmodèle : " + model + "\n" +
                "\tplaque d'immatriculation : " + licensePlate + "\n" +
                "\tannée : " + year + "\n" +
                "\tcouleur : " + color + "\n" +
                "\tkm : " + km;
        return desc;
    }
}
