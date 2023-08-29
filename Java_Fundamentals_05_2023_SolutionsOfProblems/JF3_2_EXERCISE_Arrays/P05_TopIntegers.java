package JF3_2_EXERCISE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P05_TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbersArr = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbersArr.length - 1; i++) {
            boolean isBiggest = true;
            int positionSaver = i;
            for (int j = i + 1; j < numbersArr.length; j++) {
                if (numbersArr[i] <= numbersArr[j]) {
                    isBiggest = false;
                    positionSaver = j - 1;
                    break;
                }
            }
            i = positionSaver;
            if (isBiggest) {
                System.out.printf("%d ", numbersArr[i]);
            }
        }
        System.out.println(numbersArr[numbersArr.length - 1]);
    }
}
