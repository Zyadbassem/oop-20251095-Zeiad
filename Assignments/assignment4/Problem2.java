import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Diameter: ");
        double d = input.nextDouble();
        System.out.print("Enter Height: ");
        double h = input.nextDouble();

        System.out.println("Volume: " + Math.round(coneVolume(d, h) * 10.0) / 10.0);
    }    
    public static double coneVolume(double d, double h)
    {
        double r = d * 0.5;
        double volume = (1.0/3.0) * Math.PI * r * r * h;

        return volume;
    }
}
