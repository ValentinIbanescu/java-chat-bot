import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        final int bottom = 0;
        final int top = 10;
        boolean inRangeZeroTen = number > bottom && number < top;
        System.out.print(inRangeZeroTen);
    }
}