package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P01_Ages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt((scanner.nextLine()));
        if (age > 65) {
            System.out.println("elder");
        } else if (age > 19) {
            System.out.println("adult");
        } else if (age > 13) {
            System.out.println("teenager");
        } else if (age > 2) {
            System.out.println("child");
        } else if (age >= 0) {
            System.out.println("baby");
        }
    }
}
