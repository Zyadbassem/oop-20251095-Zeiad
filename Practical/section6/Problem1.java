/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication68;

import java.util.Scanner;


class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    
    public BankAccount() {
        accountNumber = 1;
        accountHolder = "Zeiad";
        balance = 0;
    }
    
    public BankAccount(int aN, String aH, double b) {
        accountNumber = aN;
        accountHolder = aH;
        balance = b;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }
    
    public void withdraw(double amount) {
        if (balance > amount) balance -= amount;
        else System.out.println("Please make sure there is enough money");
    }
    
    public int getAN() {
        return accountNumber;
    }
    public void setAN(int aN) {
        accountNumber = aN;
    }
    
    public String getAH() {
        return accountHolder;
    }
    public void setAH(String aH) {
        accountHolder = aH;
    }
    
    public double getB() {
        return balance;
    }
    public void setB(double b) {
        balance = b;
    }
    
}
/**
 *
 * @author STUDENT
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BankAccount A = new BankAccount();
        
        System.out.print("Enter your name: ");
        String name = input.next();
        
        System.out.print("Enter your Account number: ");
        int AN = input.nextInt();
        
        System.out.print("Enter your balance: ");
        double b = input.nextDouble();
        
        A.setAH(name);
        A.setAN(AN);
        A.setB(b);
        
        System.out.print("Deposit: ");
        A.deposit(input.nextDouble());
        System.out.println("Balance: " + A.getB());
        
        System.out.print("Withdraw: ");
        A.withdraw(input.nextDouble());
        System.out.println("Balance: " + A.getB());
    }
    
}
