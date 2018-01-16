package eu.epfc.java1970.lesson16.house;

public class Room {
    public String name;
    public double length;
    public double width;

    public Room(String name, double length, double width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
    
    public double getArea() {
        return length * width;
    }
    
}
