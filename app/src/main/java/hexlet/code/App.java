package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printMenu();
        switch (scanner.next()) {
            case "1" -> Cli.greeter();
            case "2" -> Even.genGame();
            case "3" -> Calc.genGame();
            case "4" -> Gcd.genGame();
            case "5" -> Progression.genGame();
            case "6" -> Prime.genGame();
            case "0" -> {
            }
            default -> System.out.println("Please enter number 1, 2, 3 ... 6 or 0 for exit.");
        }
        scanner.close();
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
