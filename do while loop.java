//Alternative tarika jo while if loop ki tarah
//hi kaam karta hai//


Scanner sc = new Scanner(System.in);
String choice;

do {
    //  YAHAN APNA PURE CODE LIKHO
    

    System.out.print("Do you want to continue? (yes/no): ");
    choice = sc.next();

} while (choice.equalsIgnoreCase("yes"));

System.out.println("Program ended");
