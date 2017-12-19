package eu.epfc.java1970.lesson14.aCreateSimpleObject;

/**
 *
 * @author jedepaepe
 */
public class DemoClassCarBadIdeas {
    public static void main(String[] args) {
        Car voiture = new Car();
        voiture.year = -1000000;
        voiture.licensePlate = "SUPER MARIO";
        voiture.km = -100;
        voiture.color = "Louis Michel";
        voiture.model = "MR";
    }
}
