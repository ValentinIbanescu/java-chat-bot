package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2018.");
        System.out.print("Please, remind me your name.\n> ");
        // reading a name
        String yourName = sc.next();
        // printing the customised message
        System.out.printf("What a great name you have, %s!", yourName);
    }
}
