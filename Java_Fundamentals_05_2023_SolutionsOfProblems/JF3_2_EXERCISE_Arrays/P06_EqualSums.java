package JF3_2_EXERCISE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P06_EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sumTotal = 0, sumLeft = 0;
        boolean isFound = false;

        for (int i : numbersArr) {
            sumTotal += i;
        }

        for (int i = 0; i < numbersArr.length; i++) {
            if (sumLeft == (sumTotal - sumLeft - numbersArr[i])) {
                System.out.printf("%d ", i);
                isFound = true;
            }
            sumLeft += numbersArr[i];
        }

        if (!isFound) {
            System.out.println("no");
        }
    }
}
