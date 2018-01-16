package eu.epfc.java1970.lesson16.house;

public class Test {
    
    public static void main(String[] args) {
        
        // crée les pièces (Room)
        Room hall = new Room("hall", 2.5, 2);   // instancie une Room avec name="hall", length=2.5, width:2
        Room sdb = new Room("sdb", 3, 3);       // "idem"
        Room cuisine = new Room("cuisine", 3, 3);
        Room salon = new Room("salon", 4, 5);
        Room chambre = new Room("chambre", 3, 4);
        
        // crée une maison
        House maison = new House("Rue du haricot n°1, 1000 Bruxelles");
        maison.roomList = new Room[5];  // instancie un tableau de 5 Room
                                        // attention, le tableau contient 5 null (0)
        maison.roomList[0] = hall;      // assigne l'objet référencé par la variable hall à la première entrée du tableau maison.roomList
        maison.roomList[1] = sdb;       // assigne l'objet référencé par la variable sdb à seconde entrée du tableau
        maison.roomList[2] = cuisine;   // idem
        maison.roomList[3] = salon;
        maison.roomList[4] = chambre;
        
        // affiche l'aire totale de la maison
        System.out.println("Aire de la maison : " + maison.getArea());
    }
    
}
