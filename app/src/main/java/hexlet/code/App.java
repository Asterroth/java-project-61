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
        while (true) {
            Cli.printMenu();
            switch (scanner.next()) {
                case "1" -> {
                    Cli.greeter();
                    return;
                }
                case "2" -> Even.runGame();
                case "3" -> Calc.runGame();
                case "4" -> Gcd.runGame();
                case "5" -> Progression.runGame();
                case "6" -> Prime.runGame();
                case "0" -> System.exit(0);
                default -> {
                    System.out.println("Please enter number 1, 2, 3 ... 6 or 0 for exit.");
                    System.exit(0);
                }
            }
        }
    }
}
