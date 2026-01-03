//Without using third variable//
import java.util.Scanner;

public class Swap{
    public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  while(true){
      
  System.out.print("Enter your number 1st stored in a:- ");
  int a = sc.nextInt();
  
  System.out.print("Enter Your 2nd number stored in b:- ");
  int b = sc.nextInt();
  
  System.out.println("Before Swapping : a = "+a+ ",b = "+b);
  a = a+b;
  b = a-b;
  a = a-b;
  
  System.out.println("After Swapping: a = "+a+ ",b = "+b);
    
    System.out.println();
    System.out.println("another check (yes/no)");
    String choice = sc.next();
    
   if(choice.equalsIgnoreCase("no")){
       break;
   }
    }
   System.out.println("Program ended");
   
   
   
}
   
}
