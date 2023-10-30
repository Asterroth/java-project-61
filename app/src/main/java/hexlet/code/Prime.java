package hexlet.code;
final class Prime {
    private Prime() {  }
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static void runGame(int maxRounds) {
        var player = Cli.greeter();
        System.out.println(DESCRIPTION);
        for (var i = 0; i < maxRounds; i++) {
            var question = Utils.getRandom();
            var correctAnswer = isPrime(question);
            Engine.checkAnswer(player, String.valueOf(question), correctAnswer);
        }
        System.out.println("Congratulation, " + player + "!");
        System.exit(0);
    }
    private static String isPrime(int num) {
        if (num < 2) { return "no"; }
        for (var i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { return "no"; }
        }
        return "yes";
    }
}
