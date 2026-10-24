import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int max = n;
        int min = n; 
        double sum = n;
        double counter = 1.0;
        while(n > 0) {
            System.out.print("Enter a number: ");
            n = scan.nextInt();
            if (n == 0)
                break;
            max = max > n ? max : n;
            min = min < n ? min : n;
            sum += n;
            counter++;
        } 

        System.out.println("Min: " + min + " Max: " + max + " Sum: " + sum + " Avg: " + sum / counter);

    }
}
