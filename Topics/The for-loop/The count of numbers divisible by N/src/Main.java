import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        // ** Solution with for loop **
        // int counter = 0;
        // for (int i = a; i <= b; i++) {
        //     if (i % n == 0) {
        //         counter++;
        //     }
        // }
        // System.out.print(counter);

        // ** Solution without loop **
        System.out.print(b / Math.abs(n) - a / Math.abs(n) + (a % n == 0 ? 1 : 0));
    }
}