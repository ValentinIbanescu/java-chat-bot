import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        for (int i = 1; i <= length; i++) {
            int input = scanner.nextInt();
            if (input == 1) {
                larger++;
            } else if (input == -1) {
                smaller++;
            } else {
                perfect++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}