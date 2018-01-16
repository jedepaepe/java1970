package eu.epfc.java1970.lesson16.house;

public class House {
    public String address;
    public Room[] roomList;

    public House(String address) {
        this.address = address;
    }    
    
    public double getArea() {
        double area = 0;
        for (Room room : roomList) {
            area += room.getArea();
        }
        return area;
    }
}
