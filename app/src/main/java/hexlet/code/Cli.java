package hexlet.code;
import java.util.Scanner;
class Cli {
    public static void greeter() {
        Scanner scan = new Scanner(System.in);
        String userName;
        System.out.print("May I have your name? ");
        userName = scan.nextLine();
        System.out.println("Hello " + userName + "!");
        scan.close();
    }
}
