import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        final int tens = 10;
        final int hundreds = 100;
        final int thousands = 1000;

        if (number % tens == number / thousands && number / tens % tens == number / hundreds % tens) {
            System.out.println(1);
        } else {
            System.out.println((int) (Math.random() * hundreds + 2));
        }

    }
}