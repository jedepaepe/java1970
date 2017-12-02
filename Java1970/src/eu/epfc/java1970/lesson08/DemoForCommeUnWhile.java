package eu.epfc.java1970.lesson08;

public class DemoForCommeUnWhile {

    public static void main(String[] args) {
        boolean condition = true;
        for( ; condition; ) {
            System.out.println("Hi");
        }
        // équivalent while: (ne sera jamais exécuté)
        while(condition) {
            System.out.println("Hi");
        }
    }
}
