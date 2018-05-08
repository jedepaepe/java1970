/*
 */
package eu.epfc.java1970.preparations.fileDemo;

/**
 *
 */
public class Article {
    
    private String denomination;
    private double prix;
    private String description;
    private String unite;

    public Article() {
    }

    public Article(String denomination, double prix, String description, String unite) {
        this.denomination = denomination;
        this.prix = prix;
        this.description = description;
        this.unite = unite;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    @Override
    public String toString() {
        return "Article{" + "denomination=" + denomination + ", prix=" + prix + ", description=" + description + ", unite=" + unite + '}';
    }
    
    
    
}
