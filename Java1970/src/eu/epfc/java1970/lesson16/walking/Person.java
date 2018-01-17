package eu.epfc.java1970.lesson16.walking;

/**
 * La classe modélise une personne qui soit marche, soit dort
 * 
 */
public class Person {
    public String name;                 // nom de la personne
    private boolean walking = false;    // état de la personne 
                                        // true : la personne marche
                                        // false : la personne dort
                                        // on utilise "private" pour interdir le changement 
                                        //      de walking en dehors de la classe (non vu au cours)

    /**
     * Constructeur
     * @param name : nom de la personne
     */
    public Person(String name) {
        this.name = name;
    }
    
    /**
     * méthode pour faire marcher la personne
     */
    public void walk() {
        if(!walking) {  // si walking est faux
            System.out.println("Je commence à marcher");
        } else {        // si walking est vrai
            System.out.println("Je marchais déjà");
        }
        walking = true;
    }
    
    /**
     * méthode pour faire dormir la personne
     */
    public void sleep() {
        if(walking) {
            System.out.println("Je commence à dormir");
        } else {
            System.out.println("Je dormais déjà");
        }
        walking = false;
    }
    
}
