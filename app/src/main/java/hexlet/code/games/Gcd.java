package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

public class Gcd {
    final String description = "Find the greatest common divisor of given numbers.";
    String player = Cli.greeter();

    public void runGame(int maxRounds) {
        System.out.println(description);
        for (var i = 0; i < maxRounds; i++) {
            int num1 = Utils.getRandom(0, 100);
            int num2 = Utils.getRandom(0, 100);
            String question = Integer.toString(num1) + " "
                    + Integer.toString(num2);
            Engine newRound = new Engine(question, Integer.toString(calcGCD(num1, num2)));
            newRound.checkAnswer(player);
        }
        System.out.println("Congratulation, " + player + "!");
    }

    static int calcGCD(int first, int second) {
        return second == 0 ? first : calcGCD(second, first % second);
    }
}
