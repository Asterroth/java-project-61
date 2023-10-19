package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            switch (Integer.parseInt(scanner.next())) {
                case 0:
                    scanner.close();
                    return;
                case 1:
                    Cli.greeter();
                    break;
                case 2:
                    Even.game();
                    break;
                default:
                    System.out.println("Please enter 1, 2, 3 or press 0 for exit.");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
}