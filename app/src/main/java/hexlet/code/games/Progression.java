package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;

    private Progression() {
    }
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
    // Generate random sequence of 7 numbers with random step
    private static String genSequence() {
        StringBuilder sequence = new StringBuilder();
        var item = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
        var maxStep = 9;
        var maxRandItem = 6;
        var step = Utils.getRandom(1, maxStep);
        for (var j = 0; j < maxRandItem; j++) {
            sequence.append(String.valueOf(item)).append(" ");
            item += step;
        }
        return sequence.toString();
    }
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
