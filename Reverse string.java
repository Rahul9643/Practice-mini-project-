import java.util.Scanner;

public class Reverse{
        
        static void p(String msg){
        System.out.print(msg);
        }
        static void pl(String msg){
            System.out.println(msg);
        }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
        p("Enter a string:- ");
        String input = sc.nextLine();
        char ch;
        String nstr="";
        for(int i=0; i<input.length(); i++){
            ch = input.charAt(i);
            nstr = ch+nstr;
        }
        pl("Reverse String is :"+ nstr);
        
        p("Another string Reverse? (yes/no)");
        choice = sc.nextLine();
        }
        while(choice.equalsIgnoreCase("yes"));
        pl("Program Ended");
        
    }
    
}
