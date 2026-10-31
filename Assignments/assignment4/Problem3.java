

public class Problem3 {
    public static void main(String[] args) 
    {
        System.out.println(avg(4, 7));
        System.out.println(avg(2, 4, 9));
        System.out.println(avg(2.5, 3.5));
    }   
    public static double avg(int a, int b) 
    {
        return (double) ((a + b) / 2.0);
    }
    public static double avg(int a, int b, int c)
    {
        return (double) ((a + b + c) / 3.0);
    }
    public static double avg(double a, double b)
    {
        return ((a + b) / 2.0);
    }
}
