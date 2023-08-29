package JF3_2_EXERCISE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWagons = Integer.parseInt(scanner.nextLine());
        int[] numberOfPassengers = new int[numberOfWagons];
        int sumOfPassengers = 0;

        for (int wagonCounter = 0; wagonCounter < numberOfWagons; wagonCounter++) {
            numberOfPassengers[wagonCounter] = Integer.parseInt(scanner.nextLine());
            sumOfPassengers += numberOfPassengers[wagonCounter];
        }

//        for (int wagonCounter : numberOfPassengers) {
//            System.out.printf("%d ", wagonCounter);
//        }
        System.out.println(Arrays
                .toString(numberOfPassengers)
                .replace("[", "")
                .replace("]", "")
                .replace(",", ""));
        System.out.println(sumOfPassengers);
    }
}
