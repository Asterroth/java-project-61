package hexlet.code;

final class Gcd {
    private Gcd() {  }
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    public static void runGame(int maxRounds) {
        var player = Cli.greeter();
        System.out.println(DESCRIPTION);
        for (var i = 0; i < maxRounds; i++) {
            var num1 = Utils.getRandom();
            var num2 = Utils.getRandom();
            var question = num1 + " " + num2;
            var correctAnswer = calcGCD(num1, num2);
            Engine.checkAnswer(player, question, String.valueOf(correctAnswer));
        }
        System.out.println("Congratulation, " + player + "!");
        System.exit(0);
    }

    static int calcGCD(int first, int second) {
        return second == 0 ? first : calcGCD(second, first % second);
    }
}
