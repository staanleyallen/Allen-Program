import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("\nEnter your login: ");
    String log = scan.nextLine();
    System.out.println("Enter your password: ");
    String pass = scan.nextLine();

    if(log.equals("Admin") && pass.equals("5684"))
    System.out.println("\n$10,000 in your account");
    else
    System.out.println("\nYou entered incorrect data!");

    }

}