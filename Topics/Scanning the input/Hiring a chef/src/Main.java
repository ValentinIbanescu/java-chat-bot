import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String experience = sc.next();
        String cuisine = sc.next();
        System.out.printf("The form for %s is completed. We will contact you if we need a chef " +
                "who cooks %s dishes and has %s years of experience.", name, cuisine, experience);
    }
}
