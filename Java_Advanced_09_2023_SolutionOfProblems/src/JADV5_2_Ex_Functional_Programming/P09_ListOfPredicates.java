package JADV5_2_Ex_Functional_Programming;

import java.util.*;
import java.util.function.Predicate;

public class P09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperRange = Integer.parseInt(scanner.nextLine());
        Set<Integer> dividersSet = new LinkedHashSet<>();

//        Integer[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
//                .map(Integer::parseInt)
//                .sorted((a,b) -> b.compareTo(a))
//                .toArray(Integer[]::new);

        Collections.addAll(dividersSet, Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
//                .sorted((a, b) -> b.compareTo(a))
                .toArray(Integer[]::new));

        Predicate<Integer> isDivisibleOfSet = number -> {

            for (Integer divider : dividersSet) {
                if (number < divider) return false;
                if (number % divider != 0) return false;
            }
            return true;
        };


        for (int number = 1; number <= upperRange; number++) {
            if (isDivisibleOfSet.test(number)) System.out.printf("%d ", number);
        }

    }
}
