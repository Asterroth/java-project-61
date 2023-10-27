package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;
import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    String player = Cli.greeter();

    public void runGame(int maxRounds) {
        System.out.println(description);
        for (var i = 0; i < maxRounds; i++) {
            int num = Utils.getRandom(0, 100);
            Engine newRound = new Engine(Integer.toString(num), isPrime(num));
            newRound.checkAnswer(player);
        }
        System.out.println("Congratulation, " + player + "!");
    }

    private static String isPrime(int num) {
        if (num < 2) { return "no"; }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { return "no"; }
        }
        return "yes";
    }
}
