package JF01_1_LAB_BasicSyntax_ConditionalStatements_Loops;

import java.util.Scanner;

public class P06_ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String countryName = scanner.nextLine();

        switch (countryName) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
