import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        final int divisor = 4;
        int result = 0;
        for (int i = 1; i <= length; i++) {
            int input = scanner.nextInt();
            result = input % divisor == 0 ? Math.max(input, result) : result;
        }
        System.out.println(result);
    }
}