/*
 */

package eu.epfc.java1970.preparation.jsondemo.standard;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 */
public class Person {
    
    public static void main(String[] args) {
        
    }
    private final String firstName;
    private final String lastName;
    private final int age;

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
    
    public JsonObjectBuilder getJsonObjectBuilder() {
        JsonObjectBuilder jsonObjectBuilder = Json.createObjectBuilder();
        jsonObjectBuilder.add("firstName", firstName)
                .add("lastName", lastName)
                .add("age", age);
        return jsonObjectBuilder;
    }
    
    public JsonObject getJson() {
        return getJsonObjectBuilder().build();
    }    
}
