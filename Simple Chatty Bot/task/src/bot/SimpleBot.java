package bot;

import java.util.Calendar;

public class SimpleBot {
    public static void main(String[] args) {
        String name = "VoR";
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.printf("Hello! My name is %s.\n", name);
        System.out.printf("I was created in %s.", year);
    }
}
