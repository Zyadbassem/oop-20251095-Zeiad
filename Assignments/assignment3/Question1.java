import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= 12; j++)
            {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }    
}
