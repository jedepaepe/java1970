/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author jedepaepe
 */
class Product {
    private String label;
    private double prix;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Product() {
    }

    public Product(String label, double prix) {
        this.label = label;
        this.prix = prix;
    }
    
    
}
