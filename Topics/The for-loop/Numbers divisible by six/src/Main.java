// Solution for any sequence of natural numbers. The first Int (length) is skipped from the input.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int divisor = 6;
        int sum = 0;
        scanner.skip(".");
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input % divisor == 0) {
                sum += input;
            }
        }
        System.out.print(sum);
    }
}