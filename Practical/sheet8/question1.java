/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "brand=" + brand + ", model=" + model + ", year=" + year + '}';
    }
    
    public double calcRentalPrice(int days) {
        return 500.0 * days;
    }
    public double calcRentalPrice(int days, double discount) {
        return calcRentalPrice(days) - calcRentalPrice(days) * discount /100.0;
    }
    
    public void displayDetails() {
        System.out.println(this.toString());
    }
}


class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(int numberOfDoors, String brand, String model, int year) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calcRentalPrice(int days) {
        return days * 700.0; 
    }

    @Override
    public String toString() {
        return "Car{" + "brand=" + super.getBrand() + ", model=" + super.getModel() + ", year=" + super.getYear() +  ", num of doors = " + numberOfDoors + '}';
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
    }
     
}

class MotorCycle extends Vehicle {
    private int engineCapacity;

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public MotorCycle(int engineCapacity, String brand, String model, int year) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void displayDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Motorcycle{" + "brand=" + super.getBrand() + ", model=" + super.getModel() + ", year=" + super.getYear() +  ", engineCapacity= " + engineCapacity + '}';
    }

    @Override
    public double calcRentalPrice(int days) {
        return days * 300.0;//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Car c = new Car(4, "BMW", "320", 2020);
       MotorCycle m = new MotorCycle(500, "TYE", "312", 2018);
       
        System.out.println("Price for car for 3 days: " + c.calcRentalPrice(3));
        System.out.println("Price for motor for 3 days: " + m.calcRentalPrice(3));
        System.out.println(c);
        System.out.println(m);
    }
    
    
    
}
