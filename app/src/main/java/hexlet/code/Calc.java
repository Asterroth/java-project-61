package hexlet.code;

import java.util.Scanner;
public class Calc {
    public static void game() {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int result;
        String action = "";
        var count = 0;
        String player = Cli.greeter();
        System.out.println("What is the result of the expression?");
        while (count < 3) {
            number1 = Utils.genRand(0, 100);
            number2 = Utils.genRand(0, 100);
            action = Utils.mathAction();
            System.out.println("Question: "
                                + number1 + " "
                                + action + " "
                                + number2);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (action.equals("+")) {
                result = number1 + number2;
            } else {
                result = number1 * number2;
            }
            if (String.valueOf(result).equals(answer)) {
                count++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer
                        + "' is wrong answer ;(. Correct answer was "
                        + "'" + result + "'.");
                System.out.println("Let's try again, " + player);
                return;
            }
        }
        System.out.println("Congratulations, " + player + "!");
    }
}
