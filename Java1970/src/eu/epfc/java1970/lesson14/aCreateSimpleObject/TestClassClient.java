package eu.epfc.java1970.lesson14.aCreateSimpleObject;


/**
 * Classe pour tester, explorer la classe Client
 * @author jedepaepe
 */
public class TestClassClient {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);  // exemple d'instanciation d'une classe
        Client olivier;
        olivier = new Client();
        olivier.identifier = "R2D2";
        olivier.firstName = "Olivier";
        olivier.familyName = "Durant";
        olivier.address = "18 rue du Paradis, 1000 Bruxelles";
        olivier.telephone = "023601515";
        olivier.drivingLicense = "12855956";
        
        System.out.println("Le nouveau client s'appelle " + olivier.firstName
                + " " + olivier.familyName);
        
    }
}
