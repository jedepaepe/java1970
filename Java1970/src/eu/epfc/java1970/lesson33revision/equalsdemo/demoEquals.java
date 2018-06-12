package eu.epfc.java1970.lesson33revision.equalsdemo;

import java.util.ArrayList;

public class demoEquals {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("abcd", "Le Roi", "Albert"));
        persons.add(new Person("0d_9", "Le Roi", "Paola"));
        persons.add(new Person("zdin", "Le Roi", "Mathilde"));
        persons.add(new Person("ksks", "Le Roi", "Philippe"));

        Person albert = new Person("abcd", "Le Roi", "Albert");

        System.err.println((persons.contains(albert)) ? "oui" : "non");
    }
}
