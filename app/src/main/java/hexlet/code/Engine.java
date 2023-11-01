package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private Engine() {  }
    public static int getMaxRounds() {
        int maxRounds = 3;
        return maxRounds;
    }

    public static void checkAnswer(String player,
                                   String question,
                                   String correctAnswer) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String answer = sc.next();
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            wrongAnswer(correctAnswer, answer, player);
            sc.close();
            System.exit(0);
        }
    }

    public static void wrongAnswer(String correctAnswer, String answer, String playerName) {
        System.out.println("'" + answer
                + "' is wrong answer ;(. Correct answer was "
                + "'" + correctAnswer + "'.");
        System.out.println("Let's try again, " + playerName);
    }
}
