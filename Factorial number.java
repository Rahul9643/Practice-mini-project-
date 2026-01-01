import java.util.Scanner;
public class fact{
  public static void main(String[] args){
  int factorial = 1;
        
while(true){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any number:- ");
    int number = sc.nextInt();
            
     for(int i=1; i<=number; i++){
      factorial=factorial*i;
                
            }
System.out.println("Factorial number is:" + factorial);


            System.out.println();
            System.out.println("Check another factorials ? (yes/no)");
            String choice = sc.next();
            
            if(choice.equalsIgnoreCase("no")){
                break;
            }
        }
        System.out.println("Program Ended. Thank you");
    }
}
