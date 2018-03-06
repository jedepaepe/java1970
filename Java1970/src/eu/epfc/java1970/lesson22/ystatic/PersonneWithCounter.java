package eu.epfc.java1970.lesson22.ystatic;

/**
 * Demonstration de l'utilisation de static
 */
public class PersonneWithCounter {
    public static int counter = 0;  // attaché à la classe (et tous les objets ont accès à counter)
        
    public String name;             // attaché à l'objet

    public PersonneWithCounter(String name) {
        this.name = name;
        counter++;              // incrémenter le counter
    }
    
    public static void main(String[] args) {
        PersonneWithCounter p1 = new PersonneWithCounter("Albert");
        System.out.println(PersonneWithCounter.counter);    // affiche 1
        PersonneWithCounter p2 = new PersonneWithCounter("Paola");
        System.out.println(PersonneWithCounter.counter);    // affiche 2
        
    }
    
    
}
