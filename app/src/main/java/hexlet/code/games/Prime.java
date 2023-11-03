package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private Prime() {  }
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    // Generate game rounds data. Each rows contain array with two elements: question and correct answer
    public static void genGame() {
        var player = Cli.greeter();
        String[][] gameData = new String[Engine.MAX_ROUNDS][2];
        System.out.println(DESCRIPTION);
        for (var i = 0; i < Engine.MAX_ROUNDS; i++) {
            gameData[i][0] = String.valueOf(Utils.getRandom());
            gameData[i][1] = isPrime(Integer.parseInt(gameData[i][0]));
        }
        Engine.runGame(player, gameData);
    }
    // Return "yes" in case number is prime and "no" otherwise
    private static String isPrime(int num) {
        if (num < 2) { return "no"; }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { return "no"; }
        }
        return "yes";
    }
}
