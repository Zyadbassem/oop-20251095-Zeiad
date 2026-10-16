import java.util.Scanner;

public class Problem1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score: ");

        float score = input.nextFloat();
        char grade = score >= 90 ? 'A' : score >= 80 ? 'B' : score >= 70 ? 'C' : score >= 60 ? 'D' : 'F';

        System.out.println("Grade: " + grade);
    }
}
