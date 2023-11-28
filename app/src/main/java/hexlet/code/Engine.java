package hexlet.code;
import java.util.Scanner;

public final class Engine {
    public static final int MAX_ROUNDS = 3;
    // Main method running the games
    public static void runGame(String gameDescription, String[][] gameData, boolean greeter) {
        Scanner scan = new Scanner(System.in);
        String player;
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        player = scan.nextLine();
        System.out.println("Hello, " + player + "!");
        if (greeter) {
            return;
        }
        System.out.println(gameDescription);
        for (var i = 0; i < MAX_ROUNDS; i++) {
            System.out.println("Question: " + gameData[i][0]);
            System.out.print("Your answer: ");
            String answer = scan.next();
            if (answer.equals(gameData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer
                        + "' is wrong answer ;(. Correct answer was "
                        + "'" + gameData[i][1] + "'.");
                System.out.println("Let's try again, " + player + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + player + "!");
        scan.close();
    }
}
