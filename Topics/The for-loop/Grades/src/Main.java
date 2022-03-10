import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;

        for (int i = 1; i <= n; i++) {
            String input = scanner.next();
            if ("A".equals(input)) {
                a++;
            } else if ("B".equals(input)) {
                b++;
            } else if ("C".equals(input)) {
                c++;
            } else {
                d++;
            }
        }
        System.out.println(d + " " + c + " " + b + " " + a);

    }
}