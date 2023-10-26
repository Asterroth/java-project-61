package hw1_static.games;

import hw1_static.Cli;
import hw1_static.Utils;

import java.util.Scanner;

public class Even {
    final String description = "Description Even game";

    public String getDescription() {
        return description;
    }

    public void game(String playerName) {
        Scanner sc = new Scanner(System.in);
        int num = Utils.getRandom(0, 100);
        System.out.println("Question: " + num);
        System.out.print("Your answer: ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase(isEven(num))) {
            System.out.println("Correct!");
        } else {
            Cli.wrongAnswer(isEven(num), answer, playerName);
            System.exit(0);
        }
    }

    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
