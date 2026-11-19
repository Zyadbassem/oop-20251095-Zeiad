/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication68;

import java.util.Scanner;

class Student {
    private String studentName;
    private int studentId;
    private double grade;
    
    public Student() {
        studentName = "Zeiad";
        studentId = 1;
        grade = 99.0;
    }
    
    public Student(String sN, int sId, double g) {
        studentName = sN;
        studentId = sId;
        grade = g;
    }
    
    public void updateGrade(double g) {
        grade = g;
    }
    
    public boolean isPassed() {
        if (grade >= 50) return true;
        else return false;
    }
    
    public String getSN() {
        return studentName;
    }
    
    public int getId() {
        return studentId;
    }
    
    public double getGrade() {
       return grade;
    }
    
    
}
public class javaapplication68 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a num of students: ");
       int n = input.nextInt();
       
       Student[] arr = new Student[n];
       for(int i = 0; i < n; i++)
       {
           System.out.print("Enter the name: ");
           String name = input.next();
           System.out.print("Enter the id: ");
           int id = input.nextInt();
           System.out.print("Enter the grade: ");
           double grade = input.nextDouble();
           arr[i] = new Student(name, id, grade);
       }
       
        System.out.print("Enter the index to update: (from 0 to number of students - 1).");
        int index = input.nextInt();
        System.out.print("Enter a new grade: ");
        arr[index].updateGrade(input.nextDouble());
        System.out.println("new grade: " + arr[index].getGrade());
        
    }
    
}
