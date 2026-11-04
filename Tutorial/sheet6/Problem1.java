

package Problem1;

import java.util.Scanner;

class CashRegister {
    private int itemCount;
    private double totalPrice;
    
    public CashRegister() {
        itemCount = 0;
        totalPrice = 0;
    }
    
    public CashRegister(int iCount, double tPrice) {
        itemCount = iCount;
        totalPrice = tPrice;
    }
    
    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }
    
    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }
    
    public void setItemCount(int count) {
        itemCount = count;
    }
    
    public int getItemCount(){
        return itemCount;
    }
    
     public void setTotalPrice(double price) {
        totalPrice = price;
    }
    
    public double getTotalPrice(){
        return totalPrice;
    }
}
public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CashRegister obj1 = new CashRegister();
        System.out.print("Item 1: ");
        obj1.addItem(input.nextDouble());
        System.out.print("Item 2: ");
        obj1.addItem(input.nextDouble());
        
        System.out.println("Count is " + obj1.getItemCount() + " And price is " + obj1.getTotalPrice());
        obj1.clear();
        System.out.println("After Clear " + obj1.getItemCount() + " And price is " + obj1.getTotalPrice());
    }
    
}
