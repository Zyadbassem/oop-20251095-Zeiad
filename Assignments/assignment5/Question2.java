package Question2;
import java.util.Scanner;

public class Question2 {

   
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        char[][] game = new char[3][3];
        int xC = 0 ;
        int oC = 0 ;
        boolean frow = false;
        System.out.println("Enter 9  cells( X or O ) : ");
        for(int i=0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                game[i][j] = in.next().charAt(0);
            }
        }
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++){
                System.out.print(game[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0 ; i<3 ; i++){
            for(int j = 0 ; j<3 ; j++ ) {
                if(game[i][j] == 'X'){
                    xC++;
                }
                    else if(game[i][j] == 'O'){
                            oC++;
                            }
                }
            }
        System.out.println("X count : " + xC);
        System.out.println("O count : " + oC);
        
        for(int i = 0 ; i<3 ; i++){
            if(game[i][0] == 'X' && game[i][1] == 'X' &&game[i][2] == 'X' ){
                frow = true ; 
            }
        }
        if(frow){
            System.out.println("X has a full row");
        }
        else{
            System.out.println("X Doesnt have a full row");
        }
        
    }
    
}
