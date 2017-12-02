package eu.epfc.java1970.lesson03;

public class CelsiusFarenheitConvertor2 {

    public static void main(String[] args) {
        double celsius;        // déclaration de la variable "celsius" de type double
        celsius = 17;          // assignation de 17 à la variable "celsius"
        double farenheit;      // déclaration de la variable "farenheit" de type double
        farenheit = celsius * 9 / 5 + 32;   // assignation du résultat de l'expression "celsius * 9 / 5 + 32" à la variable "farenheit"
        System.out.println(celsius + " Celsius = " + farenheit + " Farenheit");
    }

}
