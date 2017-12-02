package eu.epfc.java1970.lesson08;

public class DemoWhileCommeUnFor {

    public static void main(String[] args) {
        int i = 0;
        while(i < 10) {
            System.out.println("Hi " + i);
            i++;
        }
        
        System.out.println("\nversion for");
        for(int j=0; j < 10; j++) {
            System.out.println("Hi " + j);
        }
        // System.out.println(j);   // génère une erreur de compilation j n'existe plus

        System.out.println("\nversion for décrémentale par 2");
        for(int j=20; j > 0; j = j - 2) {
            System.out.println("Hi " + j);
        }
    }
}
