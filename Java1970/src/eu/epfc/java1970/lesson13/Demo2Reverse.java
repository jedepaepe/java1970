package eu.epfc.java1970.lesson13;

public class Demo2Reverse {
    
    public static int[] reverse(int[] source) {
        int[] result = new int[source.length];
        for(int i=0; i<source.length; i++) {
            result[source.length-1-i] = source[i];
        }
        return result;
    }
    
    public static int[] copy(int[] source) {        
        int[] result = new int[source.length];
        for(int i=0; i<source.length; i++) {
            result[i] = source[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] testSource = {1, 2, 99, 100, 1000};
        int[] inverse = reverse(testSource);
        for (int i : inverse) {
            System.out.println(i);
        }
        // test pour le fun
        if(inverse[0] == testSource[4] && inverse[1] == testSource[3]) {
            System.out.println("Réussi");
        } else {
            System.out.println("Raté");
        }
        
    }
    
}
