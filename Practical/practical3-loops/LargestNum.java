import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int newNum = 0;
        while(newNum >= 0)
        {
            System.out.print("Enter a number: ");
            newNum = input.nextInt();
            n = Math.max(newNum, n);
        }
        
        System.out.println("Largest num = "+ n);
    input.close();
}    
}
