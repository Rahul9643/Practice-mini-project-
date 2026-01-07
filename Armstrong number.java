import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        
     Scanner sc = new Scanner(System.in);
    String choice;
    do{
     int arm = 0;
     int a,b,c,d,no;
    
    
    System.out.print("Enter any number:- ");
    no = sc.nextInt();
    d = no;
    
    while(no>0){
        a = no%10;
        no = no/10;
        arm = arm+a*a*a;
    }
    if(arm==d){
        System.out.println("Armstrong number");
    }
    else{
        System.out.println("Not Armstrong number");
    }
        
        System.out.println("Check another number? (yes/no)");
        choice = sc.next();
    }
    
    while(choice.equalsIgnoreCase("yes"));
    System.out.println("Program Ended");
    
    
    }
}
