package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int MAX_ROUNDS = 3;
    private Engine() {  }
    // Main method running the games
    public static void runGame(String gameDescription, String[][] gameData) {
        var player = Cli.greeter();
        System.out.println(gameDescription);
        Scanner scan = new Scanner(System.in);
        for (var i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String answer = scan.next();
            if (answer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                wrongAnswer(gameData[i][1], answer, player);
                return;
            }
        }
        System.out.println("Congratulations, " + player + "!");
        scan.close();
    }
    // Wrong answer message
    public static void wrongAnswer(String correctAnswer, String answer, String playerName) {
        System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName + "!");
    }
}
