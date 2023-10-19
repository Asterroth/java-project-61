package hexlet.code;

import java.util.Scanner;

public class Even {

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        int number;
        var count = 0;
        String player = Cli.greeter();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (count < 3) {
            number = Utils.genRand(0, 100);
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(Utils.isEven(number))) {
                count++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer
                                       + "' is wrong answer ;(. Correct answer was "
                                       + "'" + Utils.isEven(number) + "'.");
                System.out.println("Let's try again, " + player);
                return;
            }
        }
        System.out.println("Congratulations, " + player + "!");
    }
}

