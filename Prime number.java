import java.util.Scanner;
public class Primenumber{
    public static void main(String[] args){
        while(true){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number:-");
    int number = scanner.nextInt();
    if (isPrime(number)){
        System.out.println(number + " is a prime number ");
    }
    else{
        System.out.println(number + " is a not prime number");
        
    }
            System.out.print("Do you want to check another number?(yes/no): ");
            String choice = scanner.next();
            if(choice.equalsIgnoreCase("no"));
            break;
        }        
    }
    public static boolean isPrime(int num){
        for(int i=2; i<=num/2; i++){
            if(num%i==0){
                return false;
                
            }
            
        }
        return true;
    }
}
