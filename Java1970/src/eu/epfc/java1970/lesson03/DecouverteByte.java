package eu.epfc.java1970.lesson03;

public class DecouverteByte {

    public static void main(String[] args) {
        byte nombre = 1;
        nombre++;
        System.out.println(nombre);
        nombre = 127;
        nombre++;
        System.out.println(nombre);
        nombre = 127;
//        nombre = nombre + 1;  // ne compile pas
        
    }
}
