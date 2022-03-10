import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int units = scanner.nextInt();
        final int packs = 19;
        final int throngs = 249;
        final int zounds = 999;
        if (units < 1) {
            System.out.print("no army");
        } else if (units <= packs) {
            System.out.print("pack");
        } else if (units <= throngs) {
            System.out.print("throng");
        } else if (units <= zounds) {
            System.out.print("zounds");
        } else {
            System.out.print("legion");
        }
    }
}