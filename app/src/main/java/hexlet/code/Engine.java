package hw1_static;

import hw1_static.games.Even;

public class Engine {
    public static void gameRound(int gameId, int rounds) {
        String player = Cli.greeter();
        if (gameId == 2) {
            Even evenGame = new Even();
            System.out.println(evenGame.getDescription());
            for (int i = 0; i < rounds; i++) {
                evenGame.game(player);
            }
            System.out.println("Congratulation, " + player +"!");
        } else if (gameId == 3) {
            
        }
    }
}
