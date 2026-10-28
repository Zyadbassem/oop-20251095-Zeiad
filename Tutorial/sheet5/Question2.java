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
        Scanner input = new Scanner(System.in);
        String[] passwords = new String[4];
       
        System.out.print("Enter 4 passwords: ");
        for(int i = 0; i <= 4; i++)
        {
            passwords[i] = input.next();
            if(isStrong(passwords[i]))
                System.out.println("Password " + (i+1) + ": Strong " + masked(passwords[i]));
            else
                System.out.println("Password " + (i+1) + ": Weak " + masked(passwords[i]));
        }
        
        
       
    }
    
    public static boolean isStrong(String pass)
    {
        boolean output = true;
        if(pass.trim().length() < 6)
            output = false;
        char first = pass.trim().charAt(0);
        if(!Character.isUpperCase(first))
            output = false;
        if(pass.indexOf("@") == -1)
            output = false;
        
        return output;       
    }
    
    public static String masked(String pass)
    {
        String output = "";
        output += pass.charAt(0);
        for(int i = 1; i < pass.length() - 1; i++)
            output += "*";
        output += ")";
        return output;
    }
    
}
