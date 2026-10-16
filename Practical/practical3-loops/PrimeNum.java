import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        for(int i = 2; i < n; i++)
        {
            if(n%i == 0)
            {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
        input.close();
}  
}   
