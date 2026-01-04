import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
            int factorial = 1;
            System.out.print("Enter any number:- ");
            int number = sc.nextInt();
            for(int i = 1; i<=number; i++){
                factorial = factorial*i;
            }
            System.out.println("Factorial number is :- "+ factorial);
            
          System.out.println("Check another number factorial?(yes/no)") ;
          choice = sc.next();
          
        }
        while(choice.equalsIgnoreCase("yes"));
        System.out.println("Program Ended");   
        
    }
}
