import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        final int op1 = 1;
        final int op2 = 2;
        final int op3 = 3;
        System.out.print(((n + op1) * n + op2) * n + op3);
    }
}