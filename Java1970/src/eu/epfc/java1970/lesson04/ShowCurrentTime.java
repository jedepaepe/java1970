package eu.epfc.java1970.lesson04;

public class ShowCurrentTime {

    public static void main(String[] args) {
        while (true) {
            long totalMilliSecondes = System.currentTimeMillis();   // nombre millisecondes depuis 1/1/1970 0h0m0s 000 millisecondes
            long totalSecondes = totalMilliSecondes / 1000;
            long totalMinutes = totalSecondes / 60;
            long totalHeures = totalMinutes / 60;
            long totalJours = totalHeures / 24;
            long annees = totalJours / 365;    // approximation
            System.out.println(annees + " " 
                    + totalJours % 365
                    + totalHeures % 24 + ":" 
                    + totalMinutes % 60 + ":" 
                    + totalSecondes % 60
                    + "." + totalMilliSecondes % 1000);
        }
    }
}
