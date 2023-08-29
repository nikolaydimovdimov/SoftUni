package JF3_2_EXERCISE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int firstIndex = 0, secondIndex = 0;

        for (int i = 0; i < numberArr.length - 1; i++) {
            for (int j = i + 1; j < numberArr.length; j++) {
                if (numberArr[i] != numberArr[j]) {
                    if ((j - i - 1) > secondIndex - firstIndex) {
                        firstIndex = i;
                        secondIndex = j - 1;
                    }
                    i = j - 1;
                    break;
                }
                if ((j == numberArr.length - 1) && (j - i) > (secondIndex - firstIndex)) {
                    firstIndex = i;
                    secondIndex = j;
                }
            }
        }
        for (int i = firstIndex; i <= secondIndex; i++) {
            System.out.printf("%d ", numberArr[i]);
        }
    }
}



