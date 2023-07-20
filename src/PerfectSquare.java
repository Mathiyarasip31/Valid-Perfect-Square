import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(check(number));
    }
    public static boolean check(int number) {
        for (int i = 0; i < number / 2; i++) {
            if (i * i == number)
                return true;
        }
                return false;

        }
    }

