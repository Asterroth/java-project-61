package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Gcd {
    private Gcd() {  }
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;

    // Generate game rounds data. Each rows contain array with two elements: question and correct answer
    public static void genGame() {
        var player = Cli.greeter();
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        String[] roundData;
        System.out.println(DESCRIPTION);
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            roundData = genRound();
            gameData[i][0] = roundData[0];
            gameData[i][1] = roundData[1];
        }
        Engine.runGame(player, gameData);
    }

    static int calcGCD(int first, int second) {
        return second == 0 ? first : calcGCD(second, first % second);
    }
    private static String[] genRound() {
        String[] roundData = new String[2];
        var randValue1 = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
        var randValue2 = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
        roundData[0] = String.valueOf(randValue1) + " " + String.valueOf(randValue2);
        roundData[1] = String.valueOf(calcGCD(randValue1, randValue2));
        return roundData;
    }
}
