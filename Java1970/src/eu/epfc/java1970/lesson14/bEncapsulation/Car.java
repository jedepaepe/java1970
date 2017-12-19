package eu.epfc.java1970.lesson14.bEncapsulation;

/**
 *
 * @author jedepaepe
 */
public class Car {

    private String licensePlate;
    private int year;
    private String color;
    private int km;
    private String model;

    public void setYear(int year) {
        if (year > 1900 && year < 2100) {
            // System.out.println("Car change year " + year + " => " + year);
            this.year = year;
        } else {
            System.err.println("Bad year " + year);
        }
    }

    public int getYear() {
        return year;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {        
        /* code avec nos compétences
        // doit être composé de 3 [A-Z] - 3 chiffres (AAA-111)
        if(licensePlate.length() != 7) return;
        licensePlate = licensePlate.toUpperCase();  // générosité pour l'utilisateur
        if('A'  <= licensePlate.charAt(0) && licensePlate.charAt(0) <= 'Z' && 
                'A'  <= licensePlate.charAt(1) && licensePlate.charAt(1) <= 'Z' &&
                'A'  <= licensePlate.charAt(2) && licensePlate.charAt(2) <= 'Z' &&
                '-'  == licensePlate.charAt(3) &&
                Character.isDigit(licensePlate.charAt(4)) && 
                Character.isDigit(licensePlate.charAt(5)) && 
                Character.isDigit(licensePlate.charAt(6))) {
            this.licensePlate = licensePlate;
        } */
        
        // c'est plus cours avec les regex
        if(licensePlate.matches("[A-Z]{3}-[0-9]{3}")) {
            this.licensePlate = licensePlate;
        } else {
            System.err.println("Bad licencePlate");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        // blanc, bleu, jaune, gris, vert
        if (color.equals("blanc") ||
                color.equals("bleu") ||
                color.equals("jaune") ||
                color.equals("gris") ||
                color.equals("vert")) {
            this.color = color;
        } else {
            System.err.println("Bad color");
        }
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        // >= 0 & < 1000000
        if (0 <= km && km < 1000000) {
            this.km = km;
        } else {
            System.err.println("Bad KM");
        }
    }

    public String getModel() {
        // Maserati, Porche, Ferrari
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    String getDescription() {
        String desc = "La voiture est :\n"
                + "\tmodèle : " + model + "\n"
                + "\tplaque d'immatriculation : " + licensePlate + "\n"
                + "\tannée : " + year + "\n"
                + "\tcouleur : " + color + "\n"
                + "\tkm : " + km;
        return desc;
    }
}
