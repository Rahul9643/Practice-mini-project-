//Alternative Tarika Jo While If Loop Ki tarah
//Hi Kaam Karta Hai//


Scanner sc = new Scanner(System.in);
String choice;

do {
    //  YAHAN APNA PURE CODE LIKHO
    

    System.out.print("Do you want to continue? (yes/no): ");
    choice = sc.next();

} while (choice.equalsIgnoreCase("yes"));

System.out.println("Program ended");


// EK AUR TARIKA

Scanner sc = new Scanner(System.in);
String choice = "yes";

while (choice.equalsIgnoreCase("yes")) {

    // APNA CODE

    System.out.print("Continue? (yes/no): ");
    choice = sc.next();
}

System.out.println("Program ended");

