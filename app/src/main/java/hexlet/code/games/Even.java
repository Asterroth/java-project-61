package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;


public class Even {
    final String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    String player = Cli.greeter();

    public void runGame(int maxRounds) {
        System.out.println(description);
        for (var i = 0; i < maxRounds; i++) {
            int num = Utils.getRandom(0, 100);
            Engine newRound = new Engine(Integer.toString(num), isEven(num));
            newRound.checkAnswer(player);
        }
        System.out.println("Congratulation, " + player + "!");
    }

    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
