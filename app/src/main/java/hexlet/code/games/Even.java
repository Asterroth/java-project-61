package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private Even() {  }

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;

    // Line-up of game data
    public static void genGame() {
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        String[] roundData;
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            roundData = genRound();
            gameData[i][0] = roundData[0];
            gameData[i][1] = roundData[1];
        }
        Engine.runGame(DESCRIPTION, gameData);
    }

    // Return "yes" in case number is even or "no" in case odd
    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
    // Generate game round data. Returns array of two elements: question and correct answer
    private static String[] genRound() {
        String[] roundData = new String[2];
        var randValue = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
        roundData[0] = String.valueOf(randValue);
        roundData[1] = isEven(randValue);
        return roundData;
    }
}
