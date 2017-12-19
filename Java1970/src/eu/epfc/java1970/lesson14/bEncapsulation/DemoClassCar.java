package eu.epfc.java1970.lesson14.bEncapsulation;

public class DemoClassCar {
    public static void main(String[] args) {
        Car maserati = new Car();
//        maserati.year = 2017; // ne fonctionne pas car "private year"
        maserati.setYear(2017);
        
        System.out.println(maserati.getDescription());

        maserati.setLicensePlate("AAA-111");
        maserati.setColor("blanche");
        maserati.setKm(4000);
        maserati.setModel("Maserati Top 1");
        maserati.setYear(2015);
        System.out.println(maserati.getDescription());
    }
}
