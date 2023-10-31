package hexlet.code;

import java.util.Random;

public final class Utils {
    private static final Random RANDOM_NUMBER = new Random();
    private Utils() {
    }

    // Generate a random number in the range [min; max]
    public static int getRandom(int min, int max) {
        return RANDOM_NUMBER.nextInt(min, max); }
    // Generate a random number in range [0; 100)
    public static int getRandom() {
        return RANDOM_NUMBER.nextInt(0, 100); }

    // Generate a random maths operator: '*' or '+'
    public static String mathAction() {
        return getRandom(0, 1) == 0 ? "*" : "+"; }
}
