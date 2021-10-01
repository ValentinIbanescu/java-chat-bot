import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine().replace(" ", "");
        String line2 = scanner.nextLine().replace(" ", "");
        System.out.print(line1.equals(line2));
    }
}