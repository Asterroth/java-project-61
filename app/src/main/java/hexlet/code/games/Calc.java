package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import java.util.Scanner;

public class Calc {
    final String description = "What is the result of the expression?";

    public String getDescription() {
        return description;
    }

    public void game(String playerName) {
        Scanner sc = new Scanner(System.in);
        String action = Utils.mathAction();
        int num1 = Utils.getRandom(0, 100);
        int num2 = Utils.getRandom(0, 100);
        int result = 0;
        System.out.println("Question: " + num1
                            + " " + action
                            + " " + num2);
        System.out.print("Your answer: ");
        String answer = sc.next();
        if (action.equals("+")) {
            result = num1 + num2;
        } else if (action.equals("*")) {
            result = num1 * num2;
        }
        if (answer.equalsIgnoreCase(Integer.toString(result))) {
            System.out.println("Correct!");
        } else {
            Cli.wrongAnswer(Integer.toString(result), answer, playerName);
            System.exit(0);
        }
    }
}