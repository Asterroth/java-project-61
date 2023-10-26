package hw1_static;

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
                default:
                    scanner.close();
                    return;
            }
        }
    }
}
