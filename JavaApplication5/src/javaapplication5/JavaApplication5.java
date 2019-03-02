/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.util.Scanner;

/**
 *
 * @author parallels
 */
public class JavaApplication5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        int i;
        int j;
        int numElements;
        int numMatches = 1;
        int distinctElements = 0; 
        
        numElements = scnr.nextInt();
        
        String[] userInput = new String[numElements];
        String[][] names = new String[numElements][2];

        for (i = 0; i < numElements; i++) {
            userInput[i] = scnr.next();
            //names[i] =userInput[i];
        }
        int distinctElement = 0;
        for (i = 0; i < userInput.length; i++) {

            for (j = 0; j < names.length; j++) {
                
                if(!userInput[i].equals(names[i][0])) {
                    names[distinctElements][0] = userInput[i];
                    names[distinctElements][1] = "1";
                    distinctElements++;
                }
                else
                {
                    
                }
                
            }
            
//            for (j = 0; j < userInput.length; j++) {
//
//                if (userInput[i] != null) {
//                    if (userInput[i].equals(userInput[j])) {
//                        numMatches++;
//                    } else {
//                        numMatches = 1;
//                    }
//                }
//            }

            //if(userInput[i].equals(names[j])){
            //  numMatches++;
            //}
            //}
        }

        for (i = 0; i < numElements; i++) {
            System.out.println(userInput[i] + " " + numMatches);
        }

    }
}

