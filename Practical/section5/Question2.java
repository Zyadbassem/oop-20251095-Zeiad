/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Question2;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter name and grade for 3 Students");
     String[][] holder = new String[3][2];
     
     for(int i = 0; i < 3; i++)
     {
        String name = scan.next();
        String grade = scan.next();
        holder[i][0] = name;
        holder[i][1] = grade.toUpperCase();
     }
     
     for(int i = 0; i <3; i++)
            System.out.println("Student: " + holder[i][0] + " Grade: " + holder[i][1]);
     int aCounter = 0;
     int nameCounter = 0;
        System.out.println("Enter a char: ");
      String currChar = scan.next();
     for(int i = 0; i < 3; i++)
     {
          if (holder[i][1].indexOf("A") != -1)
             aCounter++;
          if(holder[i][0].startsWith(currChar))
              nameCounter++;
              
     }
        
        System.out.println("As: " + aCounter);
        System.out.println("Name starts with  " + currChar + ": " + nameCounter);
    }
    
}
