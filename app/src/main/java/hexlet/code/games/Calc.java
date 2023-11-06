package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc {
    private Calc() {  }
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;
    public static void genGame() {
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        String[] roundData;
        var player = Cli.greeter();
        System.out.println(DESCRIPTION);
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            roundData = genRound();
            gameData[i][0] = roundData[0];
            gameData[i][1] = roundData[1];
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
        var maxActionCount = 3;
        var actionId = Utils.getRandom(0, maxActionCount - 1);
        if (actionId == 0) {
            return "+";
        } else if (actionId == 1) {
            return "-";
        } else {
            return "*";
        }
    }
    // Generate game rounds data. Each rows contain array with two elements: question and correct answer
    private static String[] genRound() {
        String[] roundData = new String[2];
        var num1 = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
        var num2 = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
        var action = mathAction();
        roundData[0] = num1 + " " + action + " " + num2;
        roundData[1] = calcAction(num1, num2, action);
        return roundData;
    }
}
