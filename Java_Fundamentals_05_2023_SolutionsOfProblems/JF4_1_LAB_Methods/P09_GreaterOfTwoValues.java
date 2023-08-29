package JF4_1_LAB_Methods;

import java.util.Scanner;

public class P09_GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String valuesType = scanner.nextLine();
        if (valuesType.equals("int")) {
            int valueFirst = Integer.parseInt(scanner.nextLine());
            int valueSecond = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(valueFirst, valueSecond));

        } else if (valuesType.equals("char")) {
            char valueFirst = scanner.nextLine().charAt(0);
            char valueSecond = scanner.nextLine().charAt(0);
            System.out.println(getMax(valueFirst, valueSecond));

        } else if (valuesType.equals("string")) {
            String valueFirst = scanner.nextLine();
            String valueSecond = scanner.nextLine();
            System.out.println(getMax(valueFirst, valueSecond));

        }
    }

    public static int getMax(int valueFirst, int valueSecond) {
        if (valueFirst > valueSecond) {
            return valueFirst;
        }
        return valueSecond;
    }

    public static char getMax(char valueFirst, char valueSecond) {
        if (valueFirst > valueSecond) {
            return valueFirst;
        }
        return valueSecond;
    }

    public static String getMax(String valueFirst, String valueSecond) {
        if (valueFirst.compareTo(valueSecond) >= 0) {
            return valueFirst;
        }
        return valueSecond;
    }
}
