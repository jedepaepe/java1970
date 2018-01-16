package eu.epfc.java1970.lesson16.house;

public class House {
    public String address;      // adresse de la maison
    public Room[] roomList;     // liste de pièce

    /**
     * Constructeur de la maison
     * @param address : adresse de la maison
     */
    public House(String address) {
        this.address = address;
    }    
    
    /**
     * 
     * @return l'aire de la maison
     */
    public double getArea() {
        double area = 0;
        for (Room room : roomList) {
            area += room.getArea();
        }
        return area;
    }
}
