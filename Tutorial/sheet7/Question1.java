/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication135;

import java.util.Scanner;

/**
 *
 * @author Student
 */
class Book {
    private String title;
    private String author;
    private double price;
    
    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }
    
    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void applyDis(double percentage) {
        price -= ((percentage / 100.0) * price);
    }
    
    public boolean isExpensive() {
        return price > 500;
    }
}

public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n = input.nextInt();
        Book[] books = new Book[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the title: ");
            String t = input.next();
            System.out.print("Enter the author: ");
            String a = input.next();
            System.out.print("Enter the price: ");
            double p = input.nextDouble();
            
            books[i] = new Book(t, a, p);
            System.out.print("Enter the discount percent: ");
            double percent = input.nextDouble();
            books[i].applyDis(percent);
            System.out.println("Price after: " + books[i].getPrice() + " Expensive: " + (books[i].isExpensive() ? "Yes" : "No"));
        }
    }
    
}
