import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int end1 = scanner.nextInt();
        int end2 = scanner.nextInt();

        boolean insideRange = number >= end1 && number <= end2 || number >= end2 && number <= end1;

        System.out.print(insideRange);
    }
}