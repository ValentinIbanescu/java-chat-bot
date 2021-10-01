import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = number % 2 == 0 ? number + 2 : number + 1;
        System.out.print(result);
    }
}