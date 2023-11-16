package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int MAX_ROUNDS = 3;
    // Main method running the games
    public static void runGame(String gameDescription, String[][] gameData) {
        var player = greeter();
        System.out.println(gameDescription);
        Scanner scan = new Scanner(System.in);
        for (var i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String answer = scan.next();
            if (answer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer
                        + "' is wrong answer ;(. Correct answer was "
                        + "'" + gameData[i][1] + "'.");
                System.out.println("Let's try again, " + player + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + player + "!");
        scan.close();
    }

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
