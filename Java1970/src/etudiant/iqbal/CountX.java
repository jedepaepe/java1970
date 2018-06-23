/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.iqbal;

import java.util.Scanner;

/**
 *
 * @author 2701faiqbal
 */
public class CountX {   // #prof# ne fait ce qui est demandé

// public class Exercise38 {
public static void main(String[] args) {    // #prof# indentation -1
    Scanner input = new Scanner(System.in);
    System.out.println("enter the sentence: ");
    String test = input.next();
    // count
    count(test);
    System.out.println("Sentence: " + test);
    }

    public static void count(String x) {
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter++;
            } else if (Character.isDigit(ch[i])) {
                num++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
        }
        
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + other);
    }
}
