package eu.epfc.java1970.lesson13;

import java.util.Arrays;

public class Demo4Array2Dim {
    public static void main(String[] args) {
        
        int[][] tableauA2Dim = new int[3][10];
        System.out.println("Nombre de lignes: " + tableauA2Dim.length);
        System.out.println("Nombre de cellules : " + tableauA2Dim[0].length);
        System.out.println("Taille du tableau : " + (tableauA2Dim.length * tableauA2Dim[0].length));
        tableauA2Dim[0][0] = 0;
        tableauA2Dim[0][1] = 1;
        tableauA2Dim[0][2] = 2;
        
        tableauA2Dim[1][0] = 10;
        tableauA2Dim[1][1] = 11;
        tableauA2Dim[1][2] = 12;
        
        tableauA2Dim[2][0] = 20;
        
        int[] premiereLigne = tableauA2Dim[0];
        System.out.println(Arrays.toString(premiereLigne));
        
        int[] troisiemeLigne = tableauA2Dim[2];
        Arrays.fill(troisiemeLigne, -1);
        System.out.println(Arrays.toString(troisiemeLigne));
        
        printTable(tableauA2Dim);
    
        fill2DimArray(tableauA2Dim, 100);
        printTable(tableauA2Dim);
    }

    private static void printTable(int[][] tableauA2Dim) {
        System.out.println("Impression du tableau");
        for(int i=0; i<tableauA2Dim.length; i++) {          // i est l'indice sur les lignes
            for(int j=0; j<tableauA2Dim[i].length; j++) {   // j est l'indice sur les cellules
                System.out.printf("%8d", tableauA2Dim[i][j]);
            }
            System.out.println("");
        }
    }

    private static void fill2DimArray(int[][] tableauA2Dim, int valeurDeRemplissage) {
        for(int i=0; i<tableauA2Dim.length; i++) {          // i est l'indice sur les lignes
            for(int j=0; j<tableauA2Dim[i].length; j++) {   // j est l'indice sur les cellules
                tableauA2Dim[i][j] = valeurDeRemplissage;
            }
        }        
    }
    
    
}























