package hexlet.code;

final class Calc {
    private Calc() {  }
    private static final String DESCRIPTION = "What is the result of the expression?";

    public static void runGame(int maxRounds) {
        var player = Cli.greeter();
        System.out.println(DESCRIPTION);
        for (var i = 0; i < maxRounds; i++) {
            var num1 = Utils.getRandom();
            var num2 = Utils.getRandom();
            var action = Utils.mathAction();
            var question = num1 + " " + action + " " + num2;
            var correctAnswer = calcAction(num1, num2, action);
            Engine.checkAnswer(player, question, correctAnswer);
        }
        System.out.println("Congratulation, " + player + "!");
        System.exit(0);
    }

    public static String calcAction(int num1, int num2, String action) {
        var result = 0;
        if (action.equals("+")) {
            result = num1 + num2;
        } else if (action.equals("*")) {
            result = num1 * num2;
        }
        return String.valueOf(result);
    }
}
