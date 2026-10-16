import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int newNum = 0;
        while (n > 0)
        {
            newNum *= 10;
            int dig = n % 10;
            newNum +=dig;
            n /= 10;
        }
        
        System.out.println(newNum);
        input.close();
}    
}
