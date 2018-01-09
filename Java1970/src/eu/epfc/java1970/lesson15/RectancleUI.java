package eu.epfc.java1970.lesson15;

import java.util.Scanner;

public class RectancleUI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Hauteur: ");
        rect.height = input.nextDouble();
        System.out.print("Largeur: ");
        rect.width = input.nextDouble();
        System.out.println("Aire: " + rect.getArea());
        System.out.println("Perimetre: " + rect.getPerimeter());
    }
}
