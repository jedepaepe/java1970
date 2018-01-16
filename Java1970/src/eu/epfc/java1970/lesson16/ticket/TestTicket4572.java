package eu.epfc.java1970.lesson16.ticket;

public class TestTicket4572 {
    public static void main(String[] args) {
        Product latte = new Product("Latte", 4.50);
        Product gloki = new Product("Gloki", 5.00);
        Product schwein = new Product("Schwein", 22.00);
        Product chass = new Product("Chäss", 18.50);
        Ticket t4572 = new Ticket();
        t4572.number = 4572;
        t4572.firm = "Berghotel";
        t4572.itemList = new TicketItem[4];
        t4572.itemList[0] = new TicketItem(2, t4572, latte);
        t4572.itemList[1] = new TicketItem(1, t4572, gloki);
        t4572.itemList[2] = new TicketItem(1, t4572, schwein);
        t4572.itemList[3] = new TicketItem(1, t4572, chass);
        System.out.println("Total : " + t4572.getTotalPrice());
        
    }
}
