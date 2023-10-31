package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even {
    private Even() {  }

    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        var player = Cli.greeter();
        var maxRounds = Engine.getMaxRounds();
        System.out.println(DESCRIPTION);
        for (var i = 0; i < maxRounds; i++) {
            var question = Utils.getRandom();
            var correctAnswer = isEven(question);
            Engine.checkAnswer(player, String.valueOf(question), correctAnswer);
        }
        System.out.println("Congratulations, " + player + "!");
        System.exit(0);
    }

    // Проверка числа на четность: "yes" если четное и "no" если нечетное
    private static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
