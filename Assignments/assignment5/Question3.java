package Question3;
import java.util.Scanner;

public class Question3 {

    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       char[][] grid = new char[3][4];
       int v= 0 ;
        System.out.println("Enter 3 words (4 letters each ) : ");
        for(int i = 0 ; i<3 ;i++){
            String w= in.next();
            for(int j = 0 ;j<4 ; j++){
                grid[i][j] = w.charAt(j);
            }
        }
        System.out.println();
        for(int i = 0 ; i<3 ;i++){
            for(int j = 0 ;j<4 ; j++){
                System.out.print(grid[i][j] + " ");
                if("aeiou".indexOf(grid[i][j]) != -1){
                    v++;
                }
            }
            System.out.println();
        }
        System.out.print("Columns : ");
        for(int j = 0 ;j<4 ; j++){
            String c = " " ;
             for(int i = 0 ; i<3 ;i++){
                 c+=grid[i][j];
             }
             System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("Vowels: " + v);
        
    }
    
}
