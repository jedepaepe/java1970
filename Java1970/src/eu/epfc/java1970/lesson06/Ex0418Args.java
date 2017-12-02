package eu.epfc.java1970.lesson06;

public class Ex0418Args {

    public static void main(String[] args) {
        // args.length
        // check de la longueur de code : code.length()
        String code = args[0];
        
        String code1 = "" + code.charAt(0); // récupère le premier caractère
        String code2 = "" + code.charAt(1); // à vous        
        String message;
        
        switch(code1) {
            case "M": message = "Mathematics"; break;
            case "C": message = "Computer Science"; break;
            case "I": message = "Informatic Technology"; break;
            default: message = "Invalid Input";
        }
        
        // condition sur la validité de code1
        switch(code2) {
            case "1": message = message + " freshman"; break;
            case "2": message = message + " sophomore"; break;
            case "3": message = message + " junior"; break;
            case "4": message = message + " scenior"; break;
            default: message = "Invalid input";
        }

        System.out.println(message);
    }
}
