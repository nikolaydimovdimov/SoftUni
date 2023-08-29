package P03LABConditionalStatements_Advanced;

import java.util.Scanner;

public class P04_PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        if (age < 16) {
            if (gender.equals("m")) {
                System.out.println("Master");
            } else {
                System.out.println("Miss");
            }
        } else {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            } else {
                System.out.println("Ms.");
            }
        }
    }
}
