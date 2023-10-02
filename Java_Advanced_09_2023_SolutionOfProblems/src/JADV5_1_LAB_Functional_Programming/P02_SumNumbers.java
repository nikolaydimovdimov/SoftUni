package JADV5_1_LAB_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P02_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(", ");

        Function<String[], Integer> countNumbers = arrStr -> arrStr.length;

        Function<String[], Integer> sumNumbers = arrStr -> Arrays.stream(Arrays.stream(arrStr)
                .mapToInt(Integer::parseInt)
                .toArray()).sum();

        System.out.println("Count = " + countNumbers.apply(numbers));
        System.out.println("Sum = " + sumNumbers.apply(numbers));


    }

}

