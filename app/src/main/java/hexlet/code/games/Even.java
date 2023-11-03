package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private Even() {  }

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    // Generate game rounds data. Each rows contain array with two elements: question and correct answer
    public static void genGame() {
        var player = Cli.greeter();
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        System.out.println(DESCRIPTION);
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            gameData[i][0] = String.valueOf(Utils.getRandom());
            gameData[i][1] = isEven(Integer.parseInt(gameData[i][0]));
        }
        Engine.runGame(player, gameData);
    }

    // Return "yes" in case number is even and "no" in case odd
    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
