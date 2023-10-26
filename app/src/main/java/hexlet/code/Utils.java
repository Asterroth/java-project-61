package hexlet.code;

public class Utils {
    // Generate a random number in the range [min; max]
    public static int getRandom(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    // Generate a random maths operator: '*' or '+'
    public static String mathAction() { return getRandom(0, 1) == 0 ? "*" : "+"; }
}
