package eu.epfc.java1970.lesson04;

public class AutoIncrementEx {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        System.out.println("i++: " + i++);
        System.out.println("++j: " + ++j);
        
        System.out.println("i++: " + i);
        i = i + 1;
        
        j = j + 1;
        System.out.println("++j: " + j);
        
        double d = 5;
        float f = (float) d;
        System.out.println((double)1 / 2);
        
        
    }
}
