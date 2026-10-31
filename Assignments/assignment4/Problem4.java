import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an email: ");
        System.out.println(maskEmail(input.next()));
    }    
    public static String maskEmail(String email)
    {
        email = email.trim();

        int atIndex = email.indexOf("@");
        if(atIndex == -1)
            return "Not Valid";

        char[] emailArr = email.toCharArray();
        for(int i = 2; i < atIndex; i++)
            emailArr[i] = '*';
        
        for(int j = atIndex+1; j < emailArr.length; j++)
            emailArr[j] = Character.toLowerCase(emailArr[j]);
        email = new String(emailArr);

        return email;
    }
}
