import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        final int value = 20;

        boolean makeTwenty = a + b == value || a + c == value || b + c == value;

        System.out.print(makeTwenty);
    }
}