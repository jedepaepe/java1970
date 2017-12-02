package eu.epfc.java1970.lesson07;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jedepaepe
 */
public class GuessGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = (int) (Math.random() * 10);
        int guess = input.nextInt();
        while(target != guess) {
            System.out.println("Perdu");
            guess = input.nextInt();
        }
        System.out.println("Gagné");
    }
    
}
