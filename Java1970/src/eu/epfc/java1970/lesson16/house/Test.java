package eu.epfc.java1970.lesson16.house;

public class Test {
    
    public static void main(String[] args) {
        Room hall = new Room("hall", 2.5, 2);
        Room sdb = new Room("sdb", 3, 3);
        Room cuisine = new Room("cuisine", 3, 3);
        Room salon = new Room("salon", 4, 5);
        Room chambre = new Room("chambre", 3, 4);
        House maison = new House("Rue du haricot n°1, 1000 Bruxelles");
        maison.roomList = new Room[5];
        maison.roomList[0] = hall;
        maison.roomList[1] = sdb;
        maison.roomList[2] = cuisine;
        maison.roomList[3] = salon;
        maison.roomList[4] = chambre;
        System.out.println("Aire de la maison : " + maison.getArea());
    }
    
}
