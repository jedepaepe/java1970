/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.epfc.java1970.lesson33revision.equalsdemo;

/**
 *
 * @author jedepaepe
 */
public class StringMatchDemo {

    public static void main(String[] args) {
        String Str = "Welcome to Tutorialspoint.com";

        System.out.print("Return Value :");
        System.out.println(Str.matches(".*Tutorials.*"));

        System.out.print("Return Value :");
        System.out.println(Str.matches("Tutorials"));

        System.out.print("Return Value :");
        System.out.println(Str.matches("Welcome.*"));
        
        System.out.println("jedepaepe@epfc.eu".matches("^(.+)@(.+)$"));
        System.out.println("coucou!not_an_email".matches("^(.+)@(.+)$"));
        System.out.println(" @ ".matches("^(.+)@(.+)$"));
    }

}
