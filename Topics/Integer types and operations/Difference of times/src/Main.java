import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int s1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int s2 = sc.nextInt();
        final int secInHour = 3600;
        final int secInMin = 60;
        int timePassed = (h2 - h1) * secInHour + (m2 - m1) * secInMin + s2 - s1;
        System.out.print(timePassed);
    }
}