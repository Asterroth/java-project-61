package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int RANDOM_MIN = 0; // Minimum random number used in the game
    private static final int RANDOM_MAX = 100; // Maximum random number used in the game
    private static final int MAX_STEP = 10; // Maximum value of step in sequence
    private static final int MIN_STEP = 1; // Minimum value of step in sequence
    private static final int SEQ_LENGTH = 6; // Sequence (progression) length

    // Line-up of game data
    public static void genGame() {
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            var firstItem = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
            var step = Utils.getRandom(MIN_STEP, MAX_STEP);
            var unknownItem = Utils.getRandom(0, SEQ_LENGTH - 1);
            String[] roundData = genSequence(firstItem, step, SEQ_LENGTH);
            gameData[i][1] = roundData[unknownItem];
            roundData[unknownItem] = "..";
            gameData[i][0] = String.join(" ", roundData);
        }
        Engine.runGame(DESCRIPTION, gameData, false);
    }
    // Generate random sequence of 6 numbers with random step
    private static String[] genSequence(int firstItem, int step, int length) {
        StringBuilder sequence = new StringBuilder();
        for (var j = 0; j < SEQ_LENGTH; j++) {
            sequence.append(firstItem).append(" ");
            firstItem += step;
        }
        return sequence.toString().split(" ");
    }
}
