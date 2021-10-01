import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cups = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        final int min = 10;
        final int minW = 15;
        final int max = 20;
        final int maxW = 25;

        boolean goodPartyNotWeekend = cups >= min && cups <= max && !weekend;
        boolean goodPartyWeekend = cups >= minW && cups <= maxW && weekend;

        System.out.print(goodPartyNotWeekend || goodPartyWeekend);
    }
}