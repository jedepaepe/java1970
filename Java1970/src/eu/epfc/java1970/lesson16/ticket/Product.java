package eu.epfc.java1970.lesson16.ticket;

public class Product {
    String name;    // nom du produit
    double price;   // prix du produit
    
    // constructeur sans argument
    Product() {}
    
    // constructeur avec arguments
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
}
