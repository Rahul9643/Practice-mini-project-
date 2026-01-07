import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice;
        do{

        System.out.print("Enter a number: ");
        int no = sc.nextInt();

        int binary = 0, place = 1;

        while (no > 0) {
            int r = no % 2;
            binary = binary + r * place;
            place = place * 10;
            no = no / 2;
        }

        System.out.println("Binary = " + binary);
        System.out.println("Find another number binary? (yes/no)");
        choice = sc.next();
        
        }
        while(choice.equalsIgnoreCase("yes"));
        System.out.println("Program Ended ");
    }
}
