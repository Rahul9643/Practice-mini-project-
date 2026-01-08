import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            int arm = 0;
            int a, d, no;

            System.out.print("Enter any number: ");
            no = sc.nextInt();
            d = no;

            while (no > 0) {
                a = no % 10;
                no = no / 10;
                arm = arm + a * a * a;
            }

            if (arm == d) {
                System.out.println("Armstrong number:- "+arm);
            } else {
                System.out.println("Not Armstrong number:- "+arm);
            }

            
            System.out.print("Do you want the definition of Armstrong number? (yes/no):- ");
            String defChoice = sc.next();

            if (defChoice.equalsIgnoreCase("yes")) {
                System.out.println("Definition:");
                System.out.println(
                    "An Armstrong number is a number in which the sum of its digits " +
                    "raised to the power of total number of digits is equal to the number itself."
                );
            }

            System.out.println("Check another number? (yes/no)");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Program Ended");
    }
  }
