import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        final int start = 0;
        final int end = 4;
        int[] numbs = IntStream.rangeClosed(start, end).toArray();
        for (int num : numbs) {
            System.out.println(num);
        }
    }
}