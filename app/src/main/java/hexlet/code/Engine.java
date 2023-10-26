package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {
    public static void gameRound(int gameId, int rounds) {
        String player = Cli.greeter();
        switch (gameId) {
            case 2:
                Even evenGame = new Even();
                System.out.println(evenGame.getDescription());
                for (int i = 0; i < rounds; i++) {
                    evenGame.game(player);
                }
                System.out.println("Congratulation, " + player +"!");
                break;
            case 3:
                Calc calcGame = new Calc();
                System.out.println(calcGame.getDescription());
                for (int i = 0; i < rounds; i++) {
                    calcGame.game(player);
                }
                System.out.println("Congratulation, " + player +"!");
                break;
            case 4:
                Gcd gcdGame = new Gcd();
                System.out.println(gcdGame.getDescription());
                for (int i = 0; i < rounds; i++) {
                    gcdGame.game(player);
                }
                System.out.println("Congratulation, " + player +"!");
                break;
            case 5:
                Progression progrGame = new Progression();
                System.out.println(progrGame.getDescription());
                for (int i = 0; i < rounds; i++) {
                    progrGame.game(player);
                }
                System.out.println("Congratulation, " + player +"!");
                break;
            case 6:
                Prime primeGame = new Prime();
                System.out.println(primeGame.getDescription());
                for (int i = 0; i < rounds; i++) {
                    primeGame.game(player);
                }
                System.out.println("Congratulation, " + player +"!");
                break;
            default:
                return;
        }
    }
}
