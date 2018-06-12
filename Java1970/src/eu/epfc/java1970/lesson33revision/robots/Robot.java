package eu.epfc.java1970.lesson33revision.robots;

/**
 *
 * @author jedepaepe
 */
public class Robot extends Ordinateur implements Deplacement {
    private String model;
    private String name;
    private String description;

    public Robot() {
        super();    // invoque le constructeur de Ordinateur
    }

    public Robot(String model, String name, String description, double puissance, String version) {
        super(puissance, version);  // invoque le constructeur de Ordinateur
        // initialisation des attributs de Robot
        this.model = model;
        this.name = name;
        this.description = description;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Robot{" + "model=" + model + 
                ", name=" + name + 
                ", description=" + description + "} " +
                super.toString();
    }
    
    @Override
    public void avance(double distance) {
        System.out.println("Le robot avance de " + distance);
    }

    @Override
    public void tourne(double angle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
