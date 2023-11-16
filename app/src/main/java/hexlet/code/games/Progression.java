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
            var question = genSequence();
            String[] seqArray = question.split(" ");
            var unknownItem = Utils.getRandom(0, seqArray.length - 1);
            gameData[i][1] = String.valueOf(seqArray[unknownItem]);
            seqArray[unknownItem] = "..";
            gameData[i][0] = String.join(" ", seqArray);
        }
        Engine.runGame(DESCRIPTION, gameData);
    }
    // Generate random sequence of 6 numbers with random step
    private static String genSequence() {
        StringBuilder sequence = new StringBuilder();
        var item = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
        var step = Utils.getRandom(MIN_STEP, MAX_STEP);
        for (var j = 0; j < SEQ_LENGTH; j++) {
            sequence.append(String.valueOf(item)).append(" ");
            item += step;
        }
        return sequence.toString();
    }
}
// 1-й генерит последовательность полную в виде стринга
// 2-й м-д генерит данные игры