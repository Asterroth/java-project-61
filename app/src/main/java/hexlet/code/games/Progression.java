package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;
public class Progression {
    final String description = "What number is missing in the progression?";
    String unknown;
    String player = Cli.greeter();

    public void runGame(int maxRounds) {
        System.out.println(description);
        for (var i = 0; i < maxRounds; i++) {
            Engine newRound = new Engine(genSequence(), unknown);
            newRound.checkAnswer(player);
        }
        System.out.println("Congratulation, " + player + "!");
    }

    String genSequence() {
        String result = "";
        int first = Utils.getRandom(0, 50);
        int step = Utils.getRandom(1, 5);
        int unknownItem = Utils.getRandom(0, 5);
        for (int i = 0; i < 6; i++) {
            if (i != unknownItem) {
                result = result + Integer.toString(first) + " ";
                first += step;
            } else {
                result = result + ".. ";
                setUnknown(first);
                first += step;
            }
        }
        return result;
    }

    private String setUnknown(int unknownValue) {
        return this.unknown=Integer.toString(unknownValue);
    }
}
