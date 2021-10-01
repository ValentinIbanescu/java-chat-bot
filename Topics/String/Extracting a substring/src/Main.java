import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.print(text.substring(start, ++end));
    }
}