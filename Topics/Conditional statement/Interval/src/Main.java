import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int a = -15;
        final int b = 12;
        final int c = 14;
        final int d = 17;
        final int e = 19;

        boolean firstInterval = number > a && number <= b;
        boolean secondInterval = number > c && number < d;
        boolean thirdInterval = number >= e;

        if (firstInterval || secondInterval || thirdInterval) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}