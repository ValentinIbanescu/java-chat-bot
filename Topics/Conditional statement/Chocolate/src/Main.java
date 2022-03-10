import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        String result = (k % n == 0 || k % m == 0) && k <= n * m ? "YES" : "NO";
        System.out.print(result);
    }
}