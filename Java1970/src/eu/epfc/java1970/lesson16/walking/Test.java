package eu.epfc.java1970.lesson16.walking;

/**
 * Code pour tester la class Personne
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person("Philippe");
        p.walk();
        p.sleep();
        p.sleep();
        p.walk();
        p.walk();
    }
}
