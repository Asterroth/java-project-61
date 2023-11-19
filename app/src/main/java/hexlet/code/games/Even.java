package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;

    // Line-up of game data
    public static void genGame() {
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            var randValue = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
            gameData[i][0] = String.valueOf(randValue);
            if (isEven(randValue)) {
                gameData[i][1] = "yes";
            } else {
                gameData[i][1] = "no";
            }
        }
        Engine.runGame(DESCRIPTION, gameData, false);
    }

    // Return true in case number is even or false in case odd
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
