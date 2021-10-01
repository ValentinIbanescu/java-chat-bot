import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int dailyFoodCost = scanner.nextInt();
        int oneWay = scanner.nextInt();
        int dailyHotel = scanner.nextInt();
        int vacationExpense = duration * dailyFoodCost + oneWay + oneWay + (duration - 1) * dailyHotel;
        System.out.print(vacationExpense);
    }
}