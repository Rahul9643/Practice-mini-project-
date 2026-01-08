import java.util.Scanner;

public class Vowelr{
    
    static void p(String msg){
        System.out.print(msg);
    }
    static void pl(String msg){
        System.out.println(msg);
            }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        p("Enter your paragraph:- ");
        String rem = sc.nextLine();
        
        String afte = rem.replaceAll("[aeiouAEIOU]","");
        pl("paragraph after removing vowels:- ");
        p(afte);
        
    }        
            
            
}
