package eu.epfc.java1970.lesson15;

/**
 * Example de classe pour modéliser une Personne
 */
public class Person {
    String firstName;   // attribut prénom
    String familyName;  // attribut nom de famille
    
    /**
     * retourne le nom complet de la personne
     */
    String getFullName() {
        return firstName + " " + familyName;
    }
    
    /**
     * code de test
     * ce code devrait être dans une autre classe, DemoPerson par exemple, car il n'est pas bon de mélanger le code business et
     *  le code de test
     */
    public static void main(String[] args) {
        Person jmd = new Person();
        jmd.firstName = "Jean-Michel";
        jmd.familyName = "Depaepe";
        String fullName = jmd.getFullName();
        System.out.println(fullName);
    }
    
}
