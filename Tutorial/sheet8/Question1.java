/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication136;


class Employee {
    private String name;
    private int id;
    private double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public void setSalary(double s) {
        salary = s;
    }
    
    public double calcBonus() {
        return salary * 0.1;
    }
    
    public double calcBonus(double p) {
        return salary * p/100;
    }
    
    @Override
    public String toString() {
        String info = "Name: " + name + " id: " + id + " Salary: " + salary;
        return info;
    }
    
    public void displayInfo() {
        System.out.println(this.toString());
    }
}

class Manager extends Employee {
    String department;
    double allowance;
    
    public Manager(String name, int id, double salary, String department, double allowance) {
        super(name, id, salary);
        this.department = department;
        this.allowance = allowance;
    }
    
    @Override
    public String toString() {
        String info = super.toString()+ " Department: " + this.department + " Allowance " + this.allowance;
        return info;
    }
    @Override
    public double calcBonus() {
        return this.getSalary() * 0.2;
    }
    
    @Override
    public void displayInfo() {
        System.out.println(this.toString());
    }
}

public class JavaApplication136 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Employee em = new Employee("Ahmed", 124, 3422.50);
       Manager ma = new Manager("Zeiad", 243, 87832.0, "IT", 34.5);
       Employee x = new Manager("Zeiad", 243, 87832.0, "IT", 34.5);
       
       
        System.out.println("Bonus for the employee: " + em.calcBonus());
        System.out.println("Bonus for the manager: " + ma.calcBonus());
        
        System.out.println("Manager \n");
        ma.displayInfo();
        System.out.println(em);
        
        System.out.println("Employee \n");
        em.displayInfo();
    }
    
}
