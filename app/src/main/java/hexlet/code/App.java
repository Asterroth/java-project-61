package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

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
                    Even evenGame = new Even();
                    evenGame.runGame(maxRounds);
                    return;
                case "3":
                    Calc calcGame = new Calc();
                    calcGame.runGame(maxRounds);
                    return;
                case "4":
                    Gcd gcdGame = new Gcd();
                    gcdGame.runGame(maxRounds);
                    return;
                case "5":
                    Progression progressionGame = new Progression();
                    progressionGame.runGame(maxRounds);
                    return;
                case "6":
                    Prime primeGame = new Prime();
                    primeGame.runGame(maxRounds);
                    return;
                default:
                    System.exit(0);
            }
        }
    }
}
