/*
https://www.mkyong.com/java/jackson-2-convert-java-object-to-from-json/
+ add 3 libraries
http://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.9.4/
annotation & binding
 */

package eu.epfc.java1970.preparation.jsondemo.jacksondemo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Example of usage of Jakson , json mapper
 */
public class Person {
    
    public static void main(String[] args) {
        try {
            File file = new File("person.json");
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(file, new Person("Albert", "Le Roi", 86));
            Person albert = mapper.readValue(file, Person.class);
            System.out.println(albert.toString());
        } catch (IOException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    
    @JsonIgnore
    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    @Override
    public String toString() {
        return "Person{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + '}';
    }

}
