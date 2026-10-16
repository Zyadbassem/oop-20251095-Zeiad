import java.util.Scanner;

public class DivisibleNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if(num % 5 == 0 && num % 3 == 0)
            System.out.println("Divisible by 3 and 5");
        else if (num % 3 == 0)
            System.out.println("Divisible by 3");
        else if (num % 5 == 0)
            System.out.println("Divisible by 5");
        else 
            System.out.println("not divisble by 3 or 5");

        input.close();
    }
    
}