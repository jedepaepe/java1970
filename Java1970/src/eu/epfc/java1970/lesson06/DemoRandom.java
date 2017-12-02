package eu.epfc.java1970.lesson06;

public class DemoRandom {

    public static void main(String[] args) {
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println(Math.random());
        
        // entre [0, 100[
        double entre0Et100 = 100.0 * Math.random();
        System.out.println("random [0, 100[ => " + entre0Et100);
        System.out.println("entier random [0, 100[ => " + (int) entre0Et100);
        
        double entre100Et200 = 100.0 + 100.0 * Math.random();
        System.out.println("random [100, 200[ => " + entre100Et200);
    }
}
