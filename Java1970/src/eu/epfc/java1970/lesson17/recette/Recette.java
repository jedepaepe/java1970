/*
 * 
 */
package eu.epfc.java1970.lesson17.recette;

/**
 *
 * @author jedepaepe
 */
public class Recette {
   String name;
   Aliment[] alimentList;
   double[] quantityList;   // bad design but simple

    public Recette(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Recette recette = new Recette("stoemp");
        recette.alimentList = new Aliment[10];
        recette.quantityList = new double[10];
        recette.alimentList[0] = new Aliment("carotte", new Category("legume"), 100, 1.13);
        recette.quantityList[0] = 1;
        recette.alimentList[1] = new Aliment("pdt", new Category("legume"), 120, 0.78);
        recette.quantityList[1] = 0.8;        
        
    }
   
}
