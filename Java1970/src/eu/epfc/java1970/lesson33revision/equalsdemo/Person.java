package eu.epfc.java1970.lesson33revision.equalsdemo;

import java.util.Objects;

public class Person implements Comparable<Person> {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.identiyCartNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        // comparaison des références (pointe sur le même objet
        if (this == obj) {
            return true;    // quitte la méthode et retourne "true"
        }
        // si obj est null, il ne pointe sur rien donc, ce ne peut pas être la même personne
        if (obj == null) {
            return false;
        }
        // les objets sont de même classe
//        if (this.getClass() != obj.getClass()) {
        if( ! (obj instanceof Person) ) {
            return false;
        }
        // cast obj en une Person
        final Person other = (Person) obj;
        // vérifie que la carte d'identité est identique
        if (this.identiyCartNumber.equals(other.identiyCartNumber)) {
            return true;
        }
        // numéro de carte d'identité différent
        return false;
    }

    
    
    @Override
    public int compareTo(Person other) {
        return identiyCartNumber.compareTo(other.getIdentiyCartNumber());
    }

    
    private String identiyCartNumber;
    private String familyName;
    private String firstName;

    @Override
    public String toString() {
        return identiyCartNumber + "; " + familyName + "; " + firstName;
    }
    
    
    

    public Person() {
    }

    public Person(String identiyCartNumber, String familyName, String firstName) {
        this.identiyCartNumber = identiyCartNumber;
        this.familyName = familyName;
        this.firstName = firstName;
    }

    public String getIdentiyCartNumber() {
        return identiyCartNumber;
    }

    public void setIdentiyCartNumber(String identiyCartNumber) {
        this.identiyCartNumber = identiyCartNumber;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
}
