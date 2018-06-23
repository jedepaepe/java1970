/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etudiant.saeed;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* Create an online command application that: 

.) asks to write a sentence 

.) asks for the treatment to be done on this sentence, with the following possibilities: 

.) capitalize 

.) put in lowercase 

.) capitalize (first letter of each word in capital letters) 

.) count the number of characters 

.) count the number of words (we consider that words are separated by spaces) 

.) search for a pattern in the sentence and give the number of occurrences of a pattern (the application must request the pattern)!) 

.) view help

.) exit the application 

More:

 *.) imagine a more elegant solution for the sentence, because in the proposed implementation, we must always reintroduce the sentence


 */

import com.sun.xml.internal.ws.util.StringUtils;    // #prof# import inutile -1
import static java.lang.System.in;                  // #prof# import inutile -1
import java.util.Scanner;
import java.util.regex.Matcher;                     // #prof# import inutile -1
import java.util.regex.Pattern;                     // #prof# import inutile -1

/**
 *
 * @author 1810adsaeed
 */
public class Adnan_Saeed_Java_SE_Question_2_Exam {  // don't respect convention for class name => AdnanSaeedJavaSEQuestion2Exam -1

    String sentence1;

    public static void main(String[] args) {
        System.out.println("Welcome to text editor.");
        System.out.println("Please enter text to edit");
        intro();
    }

    public String getSentence1() {
        return sentence1;
    }

    public void setSentence1(String sentence1) {
        this.sentence1 = sentence1;
    }

    public Adnan_Saeed_Java_SE_Question_2_Exam() {
    }

    public static void intro() {    // #prof# strange name for a fonction that does the job => run(), do(), play() ?
   
        
        System.out.println("Please select from the following commands \n"); // #prof# better in a function
        System.out.println("Enter c to capitalise every : Press c");
        System.out.println("Enter l to lower the case : Press l");
        System.out.println("Enter f to capitalise the first letter of each word : Press F");
        System.out.println("Enter n to count the number of the letter used(including spaces) : Press n");
        System.out.println("Enter w to count the number of words : Press w");
        System.out.println("Enter s to search a pattern in the text : Press s");
        System.out.println("Enter h to view help :  Press h");
        System.out.println("Enter q to exit the program : Press q");
        
       

        enterdetails();
    }

    public static void enterdetails() {     // #prof" strange name for a fonction that also does computation & display outputs
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String command = input.nextLine();

        command(sentence, command);

    }

    /**
     *
     * @param sentence
     * @param command
     */
    public static void command(String sentence, String command) {   // #prof# strange name for a function that also does the display
        Scanner input = new Scanner(System.in);
       // #prof# too much space -2
       
       // #prof# missing the do{...}while

        switch (command) {
            case "c":
                String capall = sentence.toUpperCase();
                System.out.println(capall);
              
                break;

            case "l":
                String low = sentence;  // #too complex -1
                char[] lchars = low.toLowerCase().toCharArray();
                boolean lfound = false;

                for (int i = 0; i < lchars.length; i++) {
                    if (!lfound && Character.isLetter(lchars[i])) {
                        lchars[i] = Character.toLowerCase(lchars[i]);
                        lfound = true;
                    } else if (Character.isWhitespace(lchars[i]) || lchars[i] == '.' || lchars[i] == '\'') {
                        lfound = false;
                    }
                }
                System.out.println(String.valueOf(lchars));
                break;

            case "f":
                String cap = sentence;
                char[] chars = cap.toLowerCase().toCharArray(); // #prof# seems excellent algo +2
                boolean found = false;
                for (int i = 0; i < chars.length; i++) {
                    if (!found && Character.isLetter(chars[i])) {
                        chars[i] = Character.toUpperCase(chars[i]);
                        found = true;
                    } else if (Character.isWhitespace(chars[i]) || chars[i] == '.' || chars[i] == '\'') {
                        found = false;
                    }
                }
                System.out.println(String.valueOf(chars));
                break;

            case "n": //number count of characters
                int lettercounter = sentence.length();
                System.out.println(lettercounter);
                break;

            case "w":
                int wordCount = 1;      // #prof# does not count the words but it counts the spaces
                for (int i = 0; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        wordCount++;
                        System.out.println(wordCount);  // #prof# error if one word for example, with "1  4" returns 3
                    }
                }
                break;

            case "s":
                System.out.println("Please enter key word search");
                String search = input.nextLine();
                if (sentence.contains(search)) {    // #prof# I requested the number occurences
                    System.out.println("Found the word " + search
                            + " at index number " + sentence.indexOf(search) + " and the occurance is ");
                } else {
                    System.out.println("Can't find " + search);
                }
                break;

            case "h":
                intro();    // #prof# very strange. I think you have a problem with the notion of funtion. You should fix it.

                System.out.println("Please enter the text and command again");
               
                break;

            case "q":

                System.out.println("Thanks and have a good day");
                break;

            default:
                System.out.println("Incorrect command please select correct command from the list of commands");

        }

    }
}
