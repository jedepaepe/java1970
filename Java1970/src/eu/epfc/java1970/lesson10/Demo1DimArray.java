package eu.epfc.java1970.lesson10;


public class Demo1DimArray {

    public static void main(String[] args) {
        int[] intArray = new int[4];
        intArray[0] = 100;
        System.out.println( intArray[0] );
        System.out.println( intArray[1] );
        System.out.println( intArray[2] );
        System.out.println( intArray[3] );
        
        double[] doubleArray = new double[10];
        doubleArray[0] = 1.7;
        System.out.println(doubleArray[0]);
        
        String[] stringArray = new String[4];
        stringArray[1] = "bonsoir";
        System.out.println(stringArray[1]);
        // System.out.println(stringArray[4]);  // exception

        for(int i=0; i<intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
        // affiche le tableau
        for(int i=0; i<intArray.length; i++) {
            System.out.println( intArray[i] );
        }
        
        int[][] display = new int[10][10];  // 40 caractères, 40 lignes
        for(int i=0; i<display.length; i++) {
            for(int j=0; j<display[i].length; j++) {
                display[i][j] = (int) (Math.random() * 10);
            }
        }
        for(int i=0; i<display.length; i++) {
            for(int j=0; j<display[i].length; j++) {
                System.out.print(display[i][j]);
            }
            System.out.println();
        }
        
        

    }

}
