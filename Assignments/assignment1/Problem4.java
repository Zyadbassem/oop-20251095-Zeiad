import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter days: ");
        int days = input.nextInt();

        int weeks = days / 7;
        days -= weeks * 7;

        System.out.println("Weeks: " + weeks + " Days: " + days);
    }    
}
