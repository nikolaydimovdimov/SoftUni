package JF3_2_EXERCISE_Arrays;

import java.util.Scanner;

public class P04_ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputArr = scanner.nextLine().split(" ");
        int numberRotations = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberRotations; i++) {
            String saver = inputArr[0];
            for (int j = 0; j < inputArr.length - 1; j++) {
                inputArr[j] = inputArr[j + 1];
            }
            inputArr[inputArr.length - 1] = saver;
        }
        System.out.println(String.join(" ", inputArr));
    }
}
