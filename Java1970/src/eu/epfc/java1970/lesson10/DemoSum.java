package eu.epfc.java1970.lesson10;


public class DemoSum {

    public static void main(String[] args) {
        int somme = sum('4');
        System.out.println(somme);
        System.out.println(sum(5, 6));
    }
    
    public static int sum(int min, int max) {
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;        
    }

    public static int sum(int max) {
        /*int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum += i;
        }
        return sum;
        */
        // remplacer par:
        return sum(1, max);
    }

    // pour le fun
    public static int sum(char max) {
        if (max >= '0' && max <= '9') {
            int intMax = max - '0';
            return sum(intMax);
        } else {
            System.out.println("Le caractère " + max + " n'est pas un chiffre");
            return -1;
        }
    }

    public static int sum() {
        /*        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
         */
        //remplacer par:
        return sum(10);
    }
}
