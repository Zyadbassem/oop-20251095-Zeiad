import java.util.Scanner;

public class Problem3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first score: ");
        int score1 = input.nextInt();
        
        System.out.print("Enter the sec score: ");
        int score2 = input.nextInt();

        System.out.print("Enter the third score: ");
        int score3 = input.nextInt();

        float avg = (float) (((score1 + score2 + score3)) / 3.0);
        System.out.println("Average: " + (int)avg);
        System.out.println("Average: " + String.format("%.2f", avg));
    }
}
