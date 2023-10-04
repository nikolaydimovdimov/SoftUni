package JADV5_2_Ex_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<List<Integer>, Integer> minElementIndex = numbers -> {
            int counter = 0, minNumber = Integer.MAX_VALUE, minIndex = 0;
            for (Integer number : numbers) {
                if (number <= minNumber) {
                    minIndex = counter;
                    minNumber = number;
                }
                counter++;
            }
            return minIndex;
        };

        System.out.println(minElementIndex.apply(Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList())));

    }
}
