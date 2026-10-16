import java.util.Scanner;

public class Problem3 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        float firstN = input.nextFloat();
        System.out.print("Enter the operator: ");
        char op = input.next().charAt(0);
        System.out.print("Enter the first num: ");
        float secN = input.nextFloat();

        float output;

        switch(op)
        {
            case '+':
                output = firstN+secN;
                break;
            case '-':
                output = firstN - secN;
                break;
            case '*':
                output = firstN * secN;
                break;
            case '/':
                output = firstN / secN;
                break;
            
            default:
                output = -1;
        }

        System.out.println("Result: " + output);
    }
}
