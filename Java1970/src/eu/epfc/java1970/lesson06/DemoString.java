package eu.epfc.java1970.lesson06;

public class DemoString {

    public static void main(String[] args) {
        String variableContenantUneChaineDeCaractere = "Hi";
        System.out.println(variableContenantUneChaineDeCaractere);

        String message = "Hello world";
        System.out.println("1: " + message.startsWith("He"));
        System.out.println("2: " + message.startsWith("n'importe quoi"));
        System.out.println("3: " + message.endsWith("world"));
        System.out.println("4: " + message.contains("wo"));
        System.out.println("5: " + message.contains("bonjour"));

        String csvRecord = "Jean-Michel;Depaepe;Prof;Informatique";
        String[] csvAttributes = csvRecord.split(";");
        System.out.println("Prénom : " + csvAttributes[0]);
        System.out.println("Nom : " + csvAttributes[1]);
        System.out.println("Métier : " + csvAttributes[2]);
        System.out.println("Domaine : " + csvAttributes[3]);

        System.out.println("Lengh: " + csvRecord.length());

        System.out.println("charAt(0) " + csvRecord.charAt(0));
        System.out.println("charAt(1) " + csvRecord.charAt(1));
        System.out.println("charAt(2) " + csvRecord.charAt(2));
        System.out.println("charAt(3) " + csvRecord.charAt(3));

        System.out.println("6: " + message.concat(" from Java String.concat"));
        System.out.println("7: " + message + " from Java + concat");

        System.out.println("8: " + message.indexOf("world"));
        
        System.out.println("9: " + message.toUpperCase());
        
        String sale = "  voici l'information      ";
        System.out.println("|" + sale + "|");
        System.out.println("|" + sale.trim() + "|");
        System.out.println("10: " + message.equals("Hello world"));
        System.out.println("Affiche le dernier caractère : " + 
                message.charAt(message.length()-1));
    }
}
