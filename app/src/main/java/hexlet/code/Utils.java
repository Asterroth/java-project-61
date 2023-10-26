package hw1_static;

public class Utils {
    public static int getRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
