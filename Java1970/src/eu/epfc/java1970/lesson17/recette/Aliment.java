/*
 */
package eu.epfc.java1970.lesson17.recette;

/**
 *
 * @author jedepaepe
 */
public class Aliment {
    String name;
    Category category;
    double kcal;    // per 100 g
    double price;   // par unite

    // alt-insert (constructor)
    public Aliment(String name, Category category, double kcal, double price) {
        this.name = name;
        this.category = category;
        this.kcal = kcal;
        this.price = price;
    }

    // alt-insert (toString)
    @Override
    public String toString() {
        return "Aliment{" + "name=" + name + ", category=" + category + ", kcal=" + kcal + ", price=" + price + '}';
    }

    
    public static void main(String[] args) {
        Aliment carotte = new Aliment("carotte", new Category("légume"), 100, 1.13);
        System.out.println(carotte);        // carotte.toString() est invoqué
        String categoStr = carotte.category.name;
    }
}




















