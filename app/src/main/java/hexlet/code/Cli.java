package hexlet.code;

import java.util.Scanner;

public final class Cli {
    private Cli() {  }
    // Print greeter and get player name
    public static String greeter() {
        Scanner scan = new Scanner(System.in);
        String userName;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        userName = scan.nextLine();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }
    // Print menu
    public static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
}
