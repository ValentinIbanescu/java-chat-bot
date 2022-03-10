import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double result = 0;
        int counter = 0;
        final int divisor = 3;
        for (int i = a; i <= b; i++) {
            if (i % divisor == 0) {
                result = result + i;
                counter++;
            }
        }
        System.out.print(result / counter);
    }
}