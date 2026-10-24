import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int sum = 0;

        while (n > 0) {
            int dig = n%10;
            sum+= dig;

            n /= 10;
        }

        System.out.println("Sum: " + sum);
    }    
}
