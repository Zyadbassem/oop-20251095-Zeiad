import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius;
        radius = input.nextDouble();

        double area =  Math.pow(radius, 2.0) * Math.PI;
        double circ = radius * 2 * Math.PI;

        System.out.println("Area: "+ area );
        System.out.println("Circ: "+ circ);

    }
}
