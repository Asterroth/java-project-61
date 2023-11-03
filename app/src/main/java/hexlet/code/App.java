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
                case "2" -> Even.genGame();
                case "3" -> Calc.genGame();
                case "4" -> Gcd.genGame();
                case "5" -> Progression.genGame();
                case "6" -> Prime.genGame();
                case "0" -> System.exit(0);
                default -> {
                    System.out.println("Please enter number 1, 2, 3 ... 6 or 0 for exit.");
                    scanner.close();
                    System.exit(0);
                }
            }
        }
    }
}
