import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int base = 10;
        int reverseNumber = 0;
        while (number != 0) {
            int lastDigit = number % base;
            reverseNumber = reverseNumber * base + lastDigit;
            number /= base;
        }
        System.out.print(reverseNumber);
    }
}