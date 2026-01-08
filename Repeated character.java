import java.util.Scanner;

public class RepeatedCharacterCount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String paragraph = sc.nextLine();

        paragraph = paragraph.toLowerCase();

        char[] ch = paragraph.toCharArray();

        System.out.println("\nRepeated characters count:");

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
                System.out.println(ch[i] + " = " + count);
            }
        }
    }
}
