import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hundreds = 100;
        final int tens = 10;
        System.out.print(scanner.nextInt() % hundreds / tens);
    }
}