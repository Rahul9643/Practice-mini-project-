import java.util.Scanner;

public class Ast{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows:- ");
    int rows = sc.nextInt();
    
    for(int i=rows; i>=1; i--){
        for (int s = rows -i; s>0; s--){
            System.out.print("");
            
        }
        for(int j=1; j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
}
