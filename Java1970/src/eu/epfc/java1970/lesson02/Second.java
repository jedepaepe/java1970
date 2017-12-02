package eu.epfc.java1970.lesson02;

public class Second {

    public static void main(String[] args) {
        //System.out.println("Second est exécutée");
        String prenom = "Jean-Michel";
        System.out.println(prenom);
        System.out.println("Hello " + prenom);
        prenom = "Isabelle";
        System.out.println(prenom);
        System.out.println("Hello " + prenom);
        String message;
        message = "Hello " + prenom;
        System.out.println(message);
        
        if(args.length >= 3) {
            System.out.println( args[0] );
            System.out.println( args[1] );
            System.out.println( args[2] );
        }
    }
}
