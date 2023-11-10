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
        Cli.printMenu();
        switch (scanner.next()) {
            case "1":
                Cli.greeter();
                break;
            case "2":
                Even.genGame();
                break;
            case "3":
                Calc.genGame();
                break;
            case "4":
                Gcd.genGame();
                break;
            case "5":
                Progression.genGame();
                break;
            case "6":
                Prime.genGame();
                break;
            case "0":
                break;
            default:
                System.out.println("Please enter number 1, 2, 3 ... 6 or 0 for exit.");
                break;
        }
        scanner.close();
    }
}
