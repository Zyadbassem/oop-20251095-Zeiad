import java.util.Scanner;

public class Problem2 {
    public  static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter how many: ");
        double unitsCount = input.nextInt();

        final double tax = 0.14;
        double subTotal = unitPrice * unitsCount;
        System.out.println("Subtotal: " + String.format("%.2f", subTotal) + " Tax: "+ String.format("%.2f", subTotal * tax) + " Total: " + String.format("%.2f", (subTotal + subTotal * tax)));
    }
}
