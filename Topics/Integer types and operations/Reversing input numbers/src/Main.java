// This solution works for as many integers as the user has input.
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
        }
        Collections.reverse(numbers);
        numbers.forEach(number -> System.out.print(number + " "));
    }
}