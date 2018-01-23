/*
 * 
 */
package eu.epfc.java1970.lesson17.recette;

/**
 *
 * @author jedepaepe
 */
public class DemoRecette {
    public static void main(String[] args) {
        Category legume = new Category("légume");
        System.out.println(legume);
        Category fruit = new Category("fruit");
        Category viande = new Category("viande");
        
        
        Aliment carotte = new Aliment("carotte", legume, 100, 1.13);

        // not used // example de liste de category
        Category[] categoryList = new Category[3];
        categoryList[0] = legume;
        categoryList[1] = fruit;
        categoryList[2] = viande;
    }
}
