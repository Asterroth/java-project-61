package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Progression {
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private Progression() {
    }
    // Generate game rounds data. Each rows contain array with two elements: question and correct answer
    public static void genGame() {
        var player = Cli.greeter();
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        System.out.println(DESCRIPTION);
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            var unknownItem = Utils.getRandom(0, 5);
            var question = genSequence();
            String[] seqArray = question.split(" ");
            gameData[i][1] = String.valueOf(seqArray[unknownItem]);
            seqArray[unknownItem] = "..";
            gameData[i][0] = String.join(" ", seqArray);
        }
        Engine.runGame(player, gameData);
    }
    // Generate random sequence of 7 numbers with random step
    private static String genSequence() {
        StringBuilder sequence = new StringBuilder();
        var item = Utils.getRandom();
        var step = Utils.getRandom(1, 9);
        for (var j = 0; j < 6; j++) {
            sequence.append(String.valueOf(item)).append(" ");
            item += step;
        }
        return sequence.toString();
    }
}
