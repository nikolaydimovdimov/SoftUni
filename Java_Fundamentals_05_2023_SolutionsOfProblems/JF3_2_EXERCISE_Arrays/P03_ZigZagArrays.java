package JF3_2_EXERCISE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P03_ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[numberOfLines];
        int[] secondArr = new int[numberOfLines];
        for (int i = 0; i < numberOfLines; i++) {
            String lineStr = scanner.nextLine();
            if (i % 2 == 0) {
                firstArr[i] = Integer.parseInt(lineStr.split(" ")[0]);
                secondArr[i] = Integer.parseInt(lineStr.split(" ")[1]);
            } else {
                secondArr[i] = Integer.parseInt(lineStr.split(" ")[0]);
                firstArr[i] = Integer.parseInt(lineStr.split(" ")[1]);
            }
        }
        System.out.println(Arrays
                .toString(firstArr)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
        System.out.println(Arrays
                .toString(secondArr)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
    }
}
