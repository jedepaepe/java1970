/*
 */
package eu.epfc.java1970.preparation.jsondemo.standard;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FHA576
 */
public class Staff {

    private String name;
    private int age;
    private String position;
    private BigDecimal salary;
    private List<String> skills;

    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Staff staff = createDummyObject();
            mapper.writeValue(new File("staff.json"), staff);
            String jsonInString = mapper.writeValueAsString(staff);
            System.out.println(jsonInString);
            jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(staff);
            System.out.println(jsonInString);
        } catch (IOException ex) {
            Logger.getLogger(Staff.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private static Staff createDummyObject() {
        return new Staff(
                "Albert",
                30,
                "top",
                new BigDecimal(434876.28),
                new ArrayList<>(Arrays.asList("Manager","Sale"))
        );
    }

    public Staff(String name, int age, String position, BigDecimal salary, List<String> skills) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.skills = skills;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

}
