package hexlet.code;

public class Even {
    public static void game() {
        int randomNumber = 1 + (int) (Math.random() * ((1000 - 1) + 1));
        System.out.println(randomNumber);
    }
}
