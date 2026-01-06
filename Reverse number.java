import java.util.Scanner;

public class My{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
        int no, rev=0,r,a;
        int sum = 0;    
        int count = 0;
        double avg;
            
        System.out.print("Enter any number :- ");
        no= sc.nextInt();
        
        a= no;
        while(no>0){
            r=no%10;
            rev=rev*10+r;
            sum = sum+r; // sum of reverse number 
            count++;    // yaha pr digit count ho rahe hai 
            no=no/10;
        }
            avg = (double) sum/count;   // average of number formula 
            
        System.out.println("Reverse of the number:- " +rev);
        System.out.println("Sum of the number:- "+sum); //print sum the reverse number 
        System.out.println("Average of number:- "+avg);
            
        System.out.print("Reverse Another number? (yes/no) :- ");  
        choice = sc.next();
            
        }
       while(choice.equalsIgnoreCase("yes"));
        System.out.println("Program Ended");
    }
}
