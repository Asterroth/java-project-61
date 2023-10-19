package hexlet.code;

import java.util.Scanner;

public class Even {

    // Генерируем случайное число в диапазоне [min, max]
    public static int genRand() {
        int min = 0;
        int max = 1000;
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    // Проверка числа на четность: "yes" если четное и "no" если нечетное
    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    public static void game() {
        Scanner scanner = new Scanner(System.in);
        int number;
        var count = 0;
        String player = Cli.greeter();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (count < 3) {
            number = genRand();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase(isEven(number))) {
                count++;
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer
                                       + "' is wrong answer ;(. Correct answer was "
                                       + "'" + isEven(number) + "'.");
                System.out.println("Let's try again, " + player);
                return;
            }
        }
        System.out.println("Congratulations, " + player + "!");
    }
}

