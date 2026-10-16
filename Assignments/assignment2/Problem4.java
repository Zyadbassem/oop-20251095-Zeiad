import java.util.Scanner;

public class Problem4 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the three sides:");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        
        String output;

        if (a + b < c || a + c < b || b + c < a)
            output = "Not a valid triangle";
        else if (a == b && b == c)
            output = "Equilateral";
        else if (a==b || a==c || b==c)
            output = "Isosceles";
        else
            output = "Scalene";

        System.out.println(output);
    }
}
