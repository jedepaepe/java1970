package eu.epfc.java1970.lesson15;

public class Person {
    String firstName;
    String familyName;
    
    String getFullName() {
        return firstName + " " + familyName;
    }
    
    public static void main(String[] args) {
        Person jmd = new Person();
        jmd.firstName = "Jean-Michel";
        jmd.familyName = "Depaepe";
        String fullName = jmd.getFullName();
        System.out.println(fullName);
    }
    
}
