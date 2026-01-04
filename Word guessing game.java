import java.util.Scanner;
import java.util.Random;

public class WordGuessGame {
    public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   Random rand = new Random();
   String choice;

        
   String[] words = {"JAVA", "CODE", "GAME", "LOOP", "DATA", "RAHUL", "GITHUB"};

    do {
            
    String word = words[rand.nextInt(words.length)];

     char[] guessed = new char[word.length()];
      for (int i = 0; i < guessed.length; i++) {
            guessed[i] = '_';
      }

     int wrong = 0;

      System.out.println("\n🎯 NEW WORD GENERATED!");
      System.out.println("Word Length: " + word.length());
      System.out.println("You have 3 wrong attempts");

     while (wrong < 3) {

                
     for (char c : guessed) {
         System.out.print(c + " ");
          }
         System.out.println();

         System.out.print("Guess a letter: ");
         char letter = sc.next().toUpperCase().charAt(0);

         boolean found = false;

    for (int i = 0; i < word.length(); i++) {
          if (word.charAt(i) == letter && guessed[i] == '_') {
              guessed[i] = letter;
               found = true;
          }
      }

     if (!found) {
         wrong++;
         System.out.println("❌ Wrong! Attempts left: " + (3 - wrong));
         } 
     else {
       System.out.println("✅ Correct!");
          }

              
     boolean win = true;
     for (char c : guessed) {
        if (c == '_') {
         win = false;
           break;
        }
      }

     if (win) {
        System.out.println("🎉 WORD GUESSED: " + word);
        break;  
        }
    }

  if (wrong == 3) {
      System.out.println("💀 GAME OVER! Word was: " + word);
       }

     System.out.print("Continue playing? (yes/no): ");
      choice = sc.next();

      } 
      while (choice.equalsIgnoreCase("yes"));
        System.out.println("Thanks for playing!");
        sc.close();
    }
}
