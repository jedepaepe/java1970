package eu.epfc.java1970.lesson16.ticket;

public class TicketItem {
    int quantity;
    Ticket ticket;
    Product product;
    double getTotalPrice() {
        return quantity * product.price;
    }

    public TicketItem() {
    }

    public TicketItem(int quantity, Ticket ticket, Product product) {
        this.quantity = quantity;
        this.ticket = ticket;
        this.product = product;
    }
    
    
}
