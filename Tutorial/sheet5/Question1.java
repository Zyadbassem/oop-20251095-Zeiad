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
        int[] sales = new int[7];
        double total = 0;
        
        int gtt = 0;
        System.out.print("Enter a list of 7: ");
        for(int i = 0; i < 7; i++)
        {
            sales[i] = input.nextInt();
            gtt = sales[i] > 20 ? gtt+1 : gtt;
            total += sales[i];
        }
        
        System.out.println("Total : " + total + " Days > 20 : " + gtt + " Avg: " + total / 7.0);
        
       
    }
    
}
