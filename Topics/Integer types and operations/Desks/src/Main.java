import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentsClass1 = sc.nextInt();
        int studentsClass2 = sc.nextInt();
        int studentsClass3 = sc.nextInt();
        int desksClass1 = studentsClass1 % 2 == 0 ? studentsClass1 / 2 : studentsClass1 / 2 + 1;
        int desksClass2 = studentsClass2 % 2 == 0 ? studentsClass2 / 2 : studentsClass2 / 2 + 1;
        int desksClass3 = studentsClass3 % 2 == 0 ? studentsClass3 / 2 : studentsClass3 / 2 + 1;

        System.out.print(desksClass1 + desksClass2 + desksClass3);
    }
}