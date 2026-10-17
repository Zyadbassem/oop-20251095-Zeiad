import java.util.Random;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess a num between 1 and 5: ");
        int num = scan.nextInt();

        Random r = new Random();
        int guess = r.nextInt(5) + 1;

        if (guess == num)
            System.out.println("Correct !");
        else
            System.out.println("Try again \n computer guess: " + guess);
    }    
}
