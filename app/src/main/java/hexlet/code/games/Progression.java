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

    private Progression() {
    }
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
    // Generate game round data. Returns array of two elements: question and correct answer
    private static String[] genRound() {
        String[] roundData = new String[2];
        var question = genSequence();
        String[] seqArray = question.split(" ");
        var unknownItem = Utils.getRandom(0, seqArray.length - 1);
        roundData[1] = String.valueOf(seqArray[unknownItem]);
        seqArray[unknownItem] = "..";
        roundData[0] = String.join(" ", seqArray);
        return roundData;
    }
}
