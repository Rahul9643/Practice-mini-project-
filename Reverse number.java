import java.util.Scanner;

public class My{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no, rev=0,r,a;
        System.out.print("Enter any number :- ");
        no= sc.nextInt();
        
        a= no;
        while(no>0){
            r=no%10;
            rev=rev*10+r;
            no=no/10;
        }
        System.out.println("Reverse :- " +rev);
    }
}
