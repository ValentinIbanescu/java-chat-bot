package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line

    public static void main(String[] args) {
        greet("Aid", "2022"); // change it as you need
        remindName();
        guessAge();
        count();
        test();
        // ...
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println();
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("What is the recommended Code style for a project involving external developers? (type a number)\n");
        String[] answers = {"All programmers write code in the same style following one of generally accepted coding style guides",
        "Every programmer has their own unique but consistent coding style", "Create your own style and follow it consistenly",
        "No style is needed, every time you write code as you can to save the time and effort"};

        for (int i = 0; i < answers.length; i++) {
            System.out.println(i + 1 + ". " + answers[i]);
        }
        int input = scanner.nextInt();
        while (input != 1) {
            System.out.println("Wrong answer. Please try again.");
            input = scanner.nextInt();
        }
    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
