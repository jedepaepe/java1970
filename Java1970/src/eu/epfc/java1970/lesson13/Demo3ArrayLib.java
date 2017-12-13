package eu.epfc.java1970.lesson13;

import java.util.Arrays;

public class Demo3ArrayLib {
    public static void main(String[] args) {
        double[] ds = {1.7, 100.8, 11321};
        double[] idem = ds; //! copie les références
        
        // démonstration de la copie par référence
        idem[0] = -9999999;
        System.out.println(Arrays.toString(ds));
        
        double[] copie = new double[ds.length];
        System.arraycopy(ds, 0, copie, 0, ds.length);
        System.out.println(Arrays.toString(copie));
        
        // utiliser celui-ci
        double[] copie2 = Arrays.copyOf(ds, ds.length);
        System.out.println(Arrays.toString(copie2));
        
        // trier le tableau (sur base du code utf-8 de la chaîne de caractères (TBC: To Be Confirmed)
        String[] tableauDeStrings = {"index 0", "élément 1 ", "texte 2", "a 3", " espace 4", "a 2", "a 1"};
        Arrays.sort(tableauDeStrings);
        System.out.println(Arrays.toString(tableauDeStrings));
        
        int indexDeA3 = Arrays.binarySearch(tableauDeStrings, "a 3");
        System.out.println("L'index de 'a 3' est : " + indexDeA3);
        
        int[] fillIt = new int[10];
        Arrays.fill(fillIt, 9);
        System.out.println(Arrays.toString(fillIt));
        Arrays.fill(fillIt, 2, 4, 5);
        System.out.println(Arrays.toString(fillIt));
        
        
    }
}


















