package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RANDOM_MIN = 0; // Minimum random number used in the game
    private static final int RANDOM_MAX = 100; // Maximum random number used in the game

    // Line-up of game data
    public static void genGame() {
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            var randValue = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
            gameData[i][0] = String.valueOf(randValue);
            gameData[i][1] = isPrime(randValue);
        }
        Engine.runGame(DESCRIPTION, gameData);
    }
    // Return "yes" in case number is prime or "no" otherwise
    private static String isPrime(int num) {
        if (num < 2) {
            return "no";
        }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
