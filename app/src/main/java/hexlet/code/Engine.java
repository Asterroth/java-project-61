package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int MAX_ROUNDS = 3;
    private Engine() {  }

    public static void runGame(String player, String[][] gameData) {
        Scanner scan = new Scanner(System.in);
        for (var i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String answer = scan.next();
            if (answer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                wrongAnswer(gameData[i][1], answer, player);
                scan.close();
                System.exit(0);
            }
        }
        System.out.println("Congratulations, " + player + "!");
        System.exit(0);
    }

    public static void wrongAnswer(String correctAnswer, String answer, String playerName) {
        System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName + "!");
    }
}
