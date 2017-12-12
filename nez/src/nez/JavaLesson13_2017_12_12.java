/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nez;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author 2104dalibioulleanzul
 */
public class JavaLesson13_2017_12_12 {
    public static void main(String[] args) {
        int numberMonth;
        
        int mode;
        int reverse;
        
        String[] mois ={"janvier","fevrier","mars","avril","maie","juin",
                "juilliet","aout","septembre","octobre","novembre","decembre"};
        
        System.out.println("Mode: get month =0 ,reverse = 1 ");
        Scanner input = new Scanner(System.in);
        Scanner modeInput = new Scanner(System.in);
        mode =input.nextInt();
        //numberMonth = input.nextInt()-1;
        //System.out.println("Enetrez votre mois ");
        //System.out.println(mois[numberMonth]);
        
        
        switch(mode){
            case 0:
                System.out.println("Enetrez votre mois ");
                numberMonth = input.nextInt()-1;
                System.out.println(mois[numberMonth]);
                
                break;
            case 1 :
                System.out.println("Reverse mode");
                String [] result = new String [mois.length];
                
                for(int i=0; i<mois.length;i++)
                {
                    result[i]= mois[(mois.length-1)-i];
                    System.out.println(result[i]);                    
                }
                System.out.println(Arrays.toString(result));

                break;
            case 2 :
                System.out.println("Même tableau");
                // attention copy de REF
                double[] ds = {1,2,3,};
                //double[] idem=ds; ce truc ne crée pas un nouveua tableau
                double[] item = new double[ds.length];
                System.arraycopy(ds,0,item,0,ds.length);
                System.out.println(Arrays.toString(item));
            
                
               
                       
                
                
                /*
                String[] reverseMois ={};
                
                
   
                for( int i=0; i<= mois.length ;i++ )
                {
                    reverse=(mois.length)-i;
                    reverseMois{mois{reverse]};
                }
                break;
*/
                    
            
        }
        
        
    }
    
}
