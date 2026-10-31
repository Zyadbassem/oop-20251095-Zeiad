import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        double num = getDouble(input, "Enter a number: ");
        System.out.println("Number Entered: "+num);

        System.out.print("Enter temperature in Celsius: ");
        double c = input.nextDouble();
        System.out.println(celsiusToFahrenheit(c) + " F");
    }

    public static double getDouble(Scanner input, String prompt)
    {
        System.out.print(prompt);
        double output = input.nextDouble();
        return output;
    }

    public static double celsiusToFahrenheit(double c)
    {
        return (c * 9.0 / 5.0 + 32);
    }
    
}