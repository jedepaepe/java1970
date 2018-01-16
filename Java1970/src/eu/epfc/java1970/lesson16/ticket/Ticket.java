package eu.epfc.java1970.lesson16.ticket;

public class Ticket {
    public int number;      // numéro de ticket
    public String firm;     // firme qui a généré le ticket (normalement cela devrait être un objet de type Firm, mais pour simplifier ...
    public TicketItem[] itemList;   // liste de items : les lignes du ticket
    
    // calcule le prix total du repas
    public double getTotalPrice() {
        double price = 0;                   // initialise à 0 le prix
        for (TicketItem item : itemList) {  // pour chaque ligne (item) dans le ticket
            price += item.getTotalPrice();  // ajoute le prix de l'item au prix total
        }
        return price;   // retourne le prix
    }
    
}
