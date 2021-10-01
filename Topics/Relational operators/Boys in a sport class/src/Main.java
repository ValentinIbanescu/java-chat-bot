import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int boy1 = scanner.nextInt();
        int boy2 = scanner.nextInt();
        int boy3 = scanner.nextInt();

        boolean sorted = boy1 <= boy2 && boy2 <= boy3 || boy1 >= boy2 && boy2 >= boy3;

        System.out.print(sorted);
    }
}