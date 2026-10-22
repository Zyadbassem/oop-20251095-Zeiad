

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PracticalSection4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        getInt(input,"enter your age");
        
        double x1, x2, y1, y2;
        System.out.print("Enter x1: ");
        x1 = input.nextDouble();
        
         System.out.print("Enter x2: ");
        x2 = input.nextDouble();
        
         System.out.print("Enter y1: ");
        y1 = input.nextDouble();
        
        System.out.print("Enter y2: ");
        y2 = input.nextDouble();
        
        System.out.println("Distance: " + String.format("%.2f", calcDistance(x1, x2, y1, y2)));
        System.out.println(computeArea(5.0) + '\n' +  computeArea(4.0, 6.0) + '\n' +computeArea(4.0, 6.0, true));
        
        
        System.out.print("Enter a password: ");
        String s = input.next();
        
        if(isValidPassword(s))
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
    
    public static void getInt(Scanner input, String prom) {
        System.out.print(prom);
        int age = input.nextInt();
        
        System.out.println("Recorded Age: " + age);
    }
    
    public static double calcDistance(double x1, double y1, double x2, double y2)
    {
        double dis = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return dis;
    }
    
    public static double computeArea(double x)
    {
        return x * x * Math.PI;
    }
    public static double computeArea(double x, double y)
    {
        return x * y;
    }
    public static double computeArea(double x, double y, boolean tr)
    {
        return x * y * 0.5;
    }
    
    public static boolean isValidPassword(String password) {
        boolean isValid = true;
        
        if (password.trim().length() < 8)
            isValid = false;
        
        int digitsCount = 0;
        int upperCount = 0;
        
        for (char ch: password.toCharArray()){
           if (!Character.isLetterOrDigit(ch))
               return false;
           if (Character.isDigit(ch))
               digitsCount++;
           if (Character.isUpperCase(ch))
               upperCount++;
        }
        
        if (digitsCount < 2)
            isValid = false;
        if (upperCount < 1)
            isValid = false;
        
        return isValid;
    }
}
