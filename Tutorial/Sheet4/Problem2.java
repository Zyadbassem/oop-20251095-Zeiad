import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String email = i.nextLine();

        System.out.println(extractDomain(email));
    }   
    
    public static String extractDomain(String email)
    {
        email = email.trim();
        int atIndex = email.indexOf("@");

        if(atIndex == -1 || email.length() - 1 <= atIndex)
            return "Invalid";

        return email.substring(atIndex + 1);
    }
}
