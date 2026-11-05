/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problem2;

import java.util.Scanner;



class Location {
    private double maxValue;
    private int column;
    
    public double getMax() {
        return maxValue;
    }
    
    public int getColumn() {
        return column;
    }
    
    public void setMax(double m) {
        maxValue = m;
    }
    
    public void setColumn(int n) {
        column = n;
    }
    
    public void locateLargest(double[] values) {
        double currMax = values[0];
        int index = 0;
        
        for(int i = 1; i < values.length; i++) {
            if(values[i] > currMax) {
                currMax = values[i];
                index = i;
            }
        }
        
        setColumn(index);
        setMax(currMax);
    }
            
}
public class Problem2 {

    public static void main(String[] args) {
        Location obj1 = new Location();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter num of columns: ");
        int numOfCols = input.nextInt();
        
        double[] arr = new double[numOfCols];
        System.out.print("Enter the array elements: ");
        for(int i = 0; i < numOfCols; i++) {
            arr[i] = input.nextDouble();
        }
        
        obj1.locateLargest(arr);
        System.out.println("The largest num is " + obj1.getMax() + " At position " + obj1.getColumn());
        
        
       
    }
    
}
