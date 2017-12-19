package eu.epfc.java1970.lesson14.aCreateSimpleObject;

/**
 *
 * @author jedepaepe
 */
public class DemoClassCar {
    public static void main(String[] args) {
        Car maserati = new Car();
        System.out.println(maserati.getDescription());
        maserati.color = "blanche";
        maserati.km = 47900;
        maserati.licensePlate = "AAA-001";
        maserati.model = "Maserati TOP 1";
        maserati.year = 2015;
        System.out.println(maserati.getDescription());
    }
}

















