package hexlet.code;

class Utils {

    // Генерируем случайное число в диапазоне [min, max]
    public static int genRand(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    // Проверка числа на четность: "yes" если четное и "no" если нечетное
    public static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }

    // Генерируем случайные 0 или 1 и возвращаем * или + соответственно
    public static String mathAction() {
        int randValue = genRand(0, 1);
        return randValue == 0 ? "*" : "+";
    }
}
