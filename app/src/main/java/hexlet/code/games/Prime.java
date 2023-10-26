package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Utils;

import java.util.Scanner;

public class Prime {
    final String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public String getDescription() {
        return description;
    }

    public void game(String playerName) {
        Scanner sc = new Scanner(System.in);
        int num = Utils.getRandom(0, 100);
        System.out.println("Question: " + num);
        System.out.print("Your answer: ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase(isPrime(num))) {
            System.out.println("Correct!");
        } else {
            Cli.wrongAnswer(isPrime(num), answer, playerName);
            System.exit(0);
        }
    }

    private static String isPrime(int num) {
        if (num < 2) { return "no"; }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { return "no"; }
        }
        return "yes";
    }
}
