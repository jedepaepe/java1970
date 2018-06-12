package eu.epfc.java1970.lesson33revision.equalsdemo;

import java.util.Arrays;

public class demoSort {
    public static void main(String[] args) {
        
        System.out.println((new Object()).toString());
        System.out.println("\n");
        
        Person[] persons = {
            new Person("abcd", "Le Roi", "Albert"),
            new Person("0d_9", "Le Roi", "Paola"),
            new Person("zdin", "Le Roi", "Mathilde"),
            new Person("ksks", "Le Roi", "Philippe")
        };
        for (Person person : persons) {
            System.out.println(person);
        }
        
        // ordonne la liste
        Arrays.sort(persons);
        
        System.out.println("\n");
        for (Person person : persons) {
            System.out.println(person);
        }

        // nouvelle personne Albert
        Person albert = new Person("abcd", "Le Roi", "Albert");
        // ? Albert est-il dans la liste
        // parcoure la liste à la recherche d'Albert
        for(int i=0; i<persons.length; ++i) {
            // albert == l'élément courant de la liste
            if (albert.equals( persons[i])) {
                System.out.println("Albert est dans la liste");
                break;
            }
        }
        
        
    }
    
}
