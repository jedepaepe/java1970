package eu.epfc.java1970.lesson15;

public class RectangleBatch {
    public static void main(String[] args) {        
        Rectangle rect = new Rectangle();
        rect.height = Double.valueOf(args[0]);
        rect.width = Double.valueOf(args[1]);
        System.out.println("Aire: " + rect.getArea());
        System.out.println("Perimetre: " + rect.getPerimeter());
        
        rect = new Rectangle(args);
        
        double[] input = new double[2];
        input[0] = 10;
        input[1] = 10;
        rect = new Rectangle(input);
    }
}
