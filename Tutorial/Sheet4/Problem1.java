import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.print("Enter d Value: ");
        double dV = i.nextDouble();
        System.out.print("Enter h Value: ");
        double hV = i.nextDouble();

        System.out.println("Volume: " + cylinderVolume(dV, hV));
    }    

    public static double cylinderVolume(double dV, double hV) {
        double r = dV / 2.0;
        double volume = Math.PI * hV * r * r;

        return  volume;
    }
}
