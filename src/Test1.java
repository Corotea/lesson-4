import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // Задание 1
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("четное");
        } else
            System.out.println("нечетное");
    }

}
