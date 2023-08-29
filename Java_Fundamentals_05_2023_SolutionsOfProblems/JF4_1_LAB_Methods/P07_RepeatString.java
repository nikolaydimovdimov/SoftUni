package JF4_1_LAB_Methods;

import java.util.Scanner;

public class P07_RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        int repeatTimes = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatString(inputString, repeatTimes));
    }

    public static String repeatString(String string, int times) {
        String newString = "";
        for (int i = 0; i < times; i++) {
            newString += string;
        }
        return newString;
    }
}
