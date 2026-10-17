import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        System.out.println("Ones: " + num % 10 + " Tens: " + num / 10 + " Their sum: " + ((num % 10) + (num / 10)));
    }    
}
