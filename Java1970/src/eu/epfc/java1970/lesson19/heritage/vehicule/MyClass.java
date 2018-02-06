/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.lesson19.heritage.vehicule;

/**
 *
 * @author jedepaepe
 */
public class MyClass {
    String name;

    public MyClass(String name) {
        this.name = name;
    }    
    
    public static void main(String[] args) {
        // manière classique
        MyClass[] list = new MyClass[2];
        list[0] = new MyClass("le0");
        list[1] = new MyClass("le1");
        
        // manière synthétique
        MyClass[] synt = {new MyClass("sy0"), new MyClass("sy1")};
        
        // manière intermédiaire:
        MyClass[] inter = new MyClass[] {new MyClass("in0"), new MyClass("in1")};
        
    }
    
}
