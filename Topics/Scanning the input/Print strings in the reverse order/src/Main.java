import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        while (sc.hasNext()) {
            words.add(sc.next());
        }
        Collections.reverse(words);
        words.forEach(System.out::println);
    }
}