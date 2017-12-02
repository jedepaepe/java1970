package eu.epfc.java1970.lesson03;

public class Circle2Final {

    public static void main(String[] args) {
        final double PI = 3.1415927;
        double rayon = 11;
        double perimetre = 2 * PI * rayon;
        double aire = PI * rayon * rayon;
        System.out.println("Le périmètre du cercle de rayon " + rayon + " est " 
                + perimetre);
        System.out.println("L'aire du cercle de rayon " + rayon + " est " + aire);
    }
}
