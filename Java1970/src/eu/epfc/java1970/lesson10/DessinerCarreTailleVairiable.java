package eu.epfc.java1970.lesson10;


import java.util.Scanner;

public class DessinerCarreTailleVairiable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Côté: ");
        int cote = input.nextInt();
        String line = "";
        for (int i = 0; i < cote; i++) {
            line += "#";
        }
        for (int i = 0; i < cote; i++) {
            System.out.println(line);
        }
    }

}
