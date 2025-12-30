import java.util.Scanner;

public class fabonacciseries{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Enter number of terms:- ");
        
        int number = sc.nextInt();
        
        int first= 0,second=1, next;
        System.out.println("Fabonacci series ");
        for(int i = 0; i<=number; i++){
         System.out.println(first+" ");
         next = second+first;
         first= second;
         second=next;
         
            
        }
        System.out.println();
        System.out.println("Do you want another fabonacci series? (yes/no)");
        String choice = sc.next();
        if(choice.equalsIgnoreCase("no")){
            break;
        }
        }
        System.out.println("Program Ended. Thank you");
    }
}
