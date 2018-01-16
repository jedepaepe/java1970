package eu.epfc.java1970.lesson16.ticket;

public class Ticket {
    public int number;
    public String firm;
    public TicketItem[] itemList;
    
    public double getTotalPrice() {
        double price = 0;
        for (TicketItem item : itemList) {
            price += item.getTotalPrice();
        }
        return price;
    }
    
}
