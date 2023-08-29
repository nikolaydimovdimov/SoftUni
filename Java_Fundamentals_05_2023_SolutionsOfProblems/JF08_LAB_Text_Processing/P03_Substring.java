package JF08_LAB_Text_Processing;

import java.util.Scanner;

public class P03_Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        while (secondString.contains(firstString)) {
            secondString = secondString.replace(firstString, "");
        }
        System.out.println(secondString);
    }
}
