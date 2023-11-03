package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {
    private Calc() {  }
    private static final String DESCRIPTION = "What is the result of the expression?";
    // Generate game rounds data. Each rows contain array with two elements: question and correct answer
    public static void genGame() {
        var player = Cli.greeter();
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        System.out.println(DESCRIPTION);
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            var num1 = Utils.getRandom();
            var num2 = Utils.getRandom();
            var action = mathAction();
            gameData[i][0] = num1 + " " + action + " " + num2;
            gameData[i][1] = calcAction(num1, num2, action);
        }
        Engine.runGame(player, gameData);
    }
    // Calculation of generated data
    public static String calcAction(int num1, int num2, String action) {
        var result = 0;
        if (action.equals("+")) {
            result = num1 + num2;
        } else if (action.equals("*")) {
            result = num1 * num2;
        } else {
            result = num1 - num2;
        }
        return String.valueOf(result);
    }
    // Random choice of math action
    public static String mathAction() {
        var actionId = Utils.getRandom(0, 2);
        if (actionId == 0) {
            return "+";
        } else if (actionId == 1) {
            return "-";
        } else {
            return "*";
        }
    }
}
