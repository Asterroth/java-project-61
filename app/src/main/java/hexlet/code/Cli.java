package hexlet.code;

import java.util.Scanner;

public final class Cli {  //  гриттер в энжайн и в Апп в 1-й пункт, принт в Апп
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
}
