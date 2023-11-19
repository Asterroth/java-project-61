package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Gcd {
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int RANDOM_MIN = 0; // Minimum random number used in the game
    private static final int RANDOM_MAX = 100; // Maximum random number used in the game
    // Line-up of game data
    public static void genGame() {
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            var randValue1 = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
            var randValue2 = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
            gameData[i][0] = randValue1 + " " + randValue2;
            gameData[i][1] = String.valueOf(calcGCD(randValue1, randValue2));
        }
        Engine.runGame(DESCRIPTION, gameData, false);
    }
    // Calculate GCD of two numbers
    private static int calcGCD(int first, int second) {
        return second == 0 ? first : calcGCD(second, first % second);
    }
}
