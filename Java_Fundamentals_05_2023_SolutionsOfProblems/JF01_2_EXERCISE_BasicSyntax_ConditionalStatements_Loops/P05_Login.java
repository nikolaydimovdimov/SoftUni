package JF01_2_EXERCISE_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        String passWord = "";
        String inputPass = "";

        int i;
        for (i = userName.length() - 1; i >= 0; i--) {
            passWord += userName.charAt(i);
        }

        i = 0;
        do {
            i++;
            inputPass = scanner.nextLine();
            if (inputPass.equals(passWord)) {
                System.out.printf("User %s logged in.", userName);
                break;
            } else if (i == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        } while (true);
    }
}
