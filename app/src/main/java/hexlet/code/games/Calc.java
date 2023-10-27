package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Calc {
    final String description = "What is the result of the expression?";
    String player = Cli.greeter();

    public void runGame(int maxRounds) {
        System.out.println(description);
        for (var i = 0; i < maxRounds; i++) {
            int num1 = Utils.getRandom(0, 100);
            int num2 = Utils.getRandom(0, 100);
            String action = Utils.mathAction();
            String question = Integer.toString(num1) + " "
                    + action + " " + Integer.toString(num2);
            Engine newRound = new Engine(question, calcAction(num1, num2, action));
            newRound.checkAnswer(player);
        }
        System.out.println("Congratulation, " + player + "!");
    }

    public String calcAction(int num1, int num2, String action) {
        int result = 0;
        if (action.equals("+")) {
            result = num1 + num2;
        } else if (action.equals("*")) {
            result = num1 * num2;
        }
        return String.valueOf(result);
    }
}