import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        final int div1 = 4;
        final int div2 = 100;
        final int div3 = 400;

        if (year % div1 == 0 && year % div2 != 0 || year % div3 == 0) {
            System.out.print("Leap");
        } else {
            System.out.print("Regular");
        }
    }
}