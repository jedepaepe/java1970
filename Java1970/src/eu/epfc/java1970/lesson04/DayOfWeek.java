package eu.epfc.java1970.lesson04;

public class DayOfWeek {

    public static void main(String[] args) {
        long jourCourant = 2;
        long jourDans100Jours = jourCourant + 100 % 7;
        System.out.println("Dans 100 jours, nous serons un " + jourDans100Jours);

        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
    }
}
