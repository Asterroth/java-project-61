package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int maxRounds = 3;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Cli.printMenu();
            switch (scanner.next()) {
                case "1" -> {
                    Cli.greeter();
                    return;
                }
                case "2" -> Even.runGame(maxRounds);
                case "3" -> Calc.runGame(maxRounds);
                case "4" -> Gcd.runGame(maxRounds);
                case "5" -> Progression.runGame(maxRounds);
                case "6" -> Prime.runGame(maxRounds);
                default -> System.exit(0);
            }
        }
    }
}
