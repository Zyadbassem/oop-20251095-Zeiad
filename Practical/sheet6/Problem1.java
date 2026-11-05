/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problem1;

/**
 *
 * @author Student
 */
class Invoice {
    private int invoiceId;
    private double discount;
    private double totalInvoice;
    
    public Invoice() {
        invoiceId = 1;
        discount = 2.5;
        totalInvoice = 100;
    }
    
    public Invoice(int id, double dis, double total) {
        invoiceId = id;
        discount = dis;
        totalInvoice = total;
    }
    
    public double getId() {
        return invoiceId;
    }
    
    public double getDiscount() {
        return discount;
    }
     
    public double getTotal() {
        return totalInvoice;
    }
    
    public void setId(int id) {
        invoiceId = id;
    }
    
    public void setDiscount(double dis) {
        discount = dis;
    }
    
    public void setTotal(double total) {
        totalInvoice = total;
    }
    
    public double calculateDiscountPrice() {
        return (totalInvoice - (totalInvoice * discount / 100.0));
    }
     
    
}
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Invoice obj1 = new Invoice();
        System.out.println("Before discount: " + obj1.getTotal() + " After: " + obj1.calculateDiscountPrice());
       obj1.setDiscount(5.5);
       obj1.setTotal(200);
       System.out.println("Before discount: " + obj1.getTotal() + " After: " + obj1.calculateDiscountPrice());

       
    }
    
}
