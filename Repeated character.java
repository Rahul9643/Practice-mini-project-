import java.util.Scanner;

public class RepeatedCharacterCount {
    static void p(String print){
        System.out.print(print);
    }
    static void pl(String println){
        System.out.println(println);
    }
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;
        do{

        p("Enter a paragraph:- ");
        String paragraph = sc.nextLine();

        paragraph = paragraph.toLowerCase();

        char[] ch = paragraph.toCharArray();

        pl("Repeated characters count:");

        for (int i = 0; i < ch.length; i++) {
            int count = 1;

            if (ch[i] == ' ' || ch[i] == '0')
                continue;

            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0';
                }
            }

            if (count > 1) {
                pl(ch[i] + " = " + count);
            }
            
           
            
        }
         pl("another paragraph? (yes/no)");
            choice = sc.nextLine();
       
        }
         while(choice.equalsIgnoreCase("yes"));
        pl("program ended");
    }
}
