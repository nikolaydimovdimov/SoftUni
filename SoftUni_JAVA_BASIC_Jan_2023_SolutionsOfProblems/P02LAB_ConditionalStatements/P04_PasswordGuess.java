package P02LAB_ConditionalStatements;

import java.util.Scanner;

public class P04_PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "s3cr3t!P@ssw0rd";
        String attempt = scanner.nextLine();
        if (attempt.equals(password))
            System.out.println("Welcome");
        else
            System.out.println("Wrong password!");
    }
}
