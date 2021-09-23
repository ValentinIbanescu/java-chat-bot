import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            result = sc.next().concat("\n").concat(result);
        }
        System.out.println(result);
    }
}