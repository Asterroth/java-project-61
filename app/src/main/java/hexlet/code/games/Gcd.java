package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Gcd {
    private Gcd() {  }
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    // Generate game rounds data. Each rows contain array with two elements: question and correct answer
    public static void genGame() {
        var player = Cli.greeter();
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        System.out.println(DESCRIPTION);
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            var num1 = Utils.getRandom();
            var num2 = Utils.getRandom();
            gameData[i][0] = num1 + " " + num2;
            gameData[i][1] = String.valueOf(calcGCD(num1, num2));
        }
        Engine.runGame(player, gameData);
    }

    static int calcGCD(int first, int second) {
        return second == 0 ? first : calcGCD(second, first % second);
    }
}
