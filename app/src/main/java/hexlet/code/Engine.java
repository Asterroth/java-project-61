package hexlet.code;

import java.util.Scanner;

public class Engine {
    String question;
    String correctAnswer;

    public Engine(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public void checkAnswer(String player) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Question: " + question);
        System.out.print("Your answer: ");
        String answer = sc.next();
        if (answer.equals(correctAnswer)) {
            System.out.println("Correct!");
        } else {
            Cli.wrongAnswer(correctAnswer, answer, player);
            System.exit(0);
        }
    }
}
