package JF3_2_EXERCISE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P08_MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberArr.length - 1; i++) {
            for (int j = i + 1; j < numberArr.length; j++) {
                if ((numberArr[i] + numberArr[j]) == magicSum) {
                    System.out.printf("%d %d%n", numberArr[i], numberArr[j]);
                }
            }
        }
    }
}
