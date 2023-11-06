package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Prime {
    private Prime() {  }
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int RANDOM_MIN = 0;
    private static final int RANDOM_MAX = 100;

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
    // Return "yes" in case number is prime and "no" otherwise
    private static String isPrime(int num) {
        if (num < 2) { return "no"; }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { return "no"; }
        }
        return "yes";
    }
    private static String[] genRound() {
        String[] roundData = new String[2];
        var randValue = Utils.getRandom(RANDOM_MIN, RANDOM_MAX);
        roundData[0] = String.valueOf(randValue);
        roundData[1] = isPrime(randValue);
        return roundData;
    }
}
