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
            if (isPrime(randValue)) {
                gameData[i][1] = "yes";
            } else {
                gameData[i][1] = "no";
            }
        }
        Engine.runGame(DESCRIPTION, gameData, false);
    }
    // Return true in case number is prime or false otherwise
    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
