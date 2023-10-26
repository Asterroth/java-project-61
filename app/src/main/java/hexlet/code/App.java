package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int maxRounds = 3;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Cli.printMenu();
            switch (scanner.next()) {
                case "1":
                    Cli.greeter();
                    return;
                case "2":
                    Engine.gameRound(2, maxRounds);
                    return;
                case "3":
                    Engine.gameRound(3, maxRounds);
                    return;
                case "4":
                    Engine.gameRound(4, maxRounds);
                    return;
                case "5":
                    Engine.gameRound(5, maxRounds);
                    return;
                case "6":
                    Engine.gameRound(6, maxRounds);
                    return;
                default:
                    scanner.close();
                    return;
            }
        }
    }
}
