package eu.epfc.java1970.lesson16.ticket;

public class TestTicket4572 {
    
    /**
     * crée les objets du ticket donné en exemple: 
     * https://github.com/jedepaepe/java1970/blob/master/Java1970/src/eu/epfc/java1970/lesson16/ticket/ReceiptSwiss.jpg
     * limité aux objets de type Ticket, TicketItem, Product
     */
    public static void main(String[] args) {
        // crée d'abord les différents produits
        Product latte = new Product("Latte", 4.50);     // instancie un objet de type Product
        Product gloki = new Product("Gloki", 5.00);     // idem
        Product schwein = new Product("Schwein", 22.00);
        Product chass = new Product("Chäss", 18.50);
        
        // instancie le ticket
        Ticket t4572 = new Ticket();
        t4572.number = 4572;            // initialise le numéro de ticket
        t4572.firm = "Berghotel";       // initialise la firme
        t4572.itemList = new TicketItem[4];     // initialise le tableau de TicketItem, 
                                                // attention: le tableau a bien 4 entrées,
                                                // mais celles-ci sont null (0, elles ne référence aucun TicketItem)
        t4572.itemList[0] = new TicketItem(2, t4572, latte);    // instancie un TicketItem et sauve sa référence dans le tableau
        t4572.itemList[1] = new TicketItem(1, t4572, gloki);    // instancie un TicketItem et sauve sa référence dans le tableau
        t4572.itemList[2] = new TicketItem(1, t4572, schwein);  // idem
        t4572.itemList[3] = new TicketItem(1, t4572, chass);    // idem
        
        // affiche le prix total du ticket
        System.out.println("Total : " + t4572.getTotalPrice());
        
    }
}
