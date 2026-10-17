import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        int i, j;
        System.out.print("Enter the first num: ");
        i = scan.nextInt();

        System.out.print("Enter the sec num: ");
        j = scan.nextInt();

        int sum = i + j;
        double avg = sum / 2.0;

        int rem = i % j;

        System.out.println("Sum: " + sum + " Avg: " + String.format("%.2f", avg) + " Remainder: " + rem );
    }
}
