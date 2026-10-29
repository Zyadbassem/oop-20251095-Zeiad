/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Question1;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int num = (int) Math.round(Math.random() *  50);
       int counter = 0;
       do {
           System.out.println("Guess a num: ");
           int guess = input.nextInt();
           if(num == guess)
           {
               System.out.println("Correct!");
               break;
           }
           else if(num > guess)
               System.out.println("Higher");
           else 
               System.out.println("Lower");
           
           counter++;
       } while (counter < 5);
        System.out.println("Num was: " + num);
    }
    
}
