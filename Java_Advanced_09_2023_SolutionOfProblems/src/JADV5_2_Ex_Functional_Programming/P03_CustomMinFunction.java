package JADV5_2_Ex_Functional_Programming;

import java.util.*;
import java.util.function.Function;

public class P03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Function<Integer[], Integer> getMinNumber = numbers -> Arrays.stream(numbers)
                .min((a, b) -> a.compareTo(b))
                .get();
        // numbers->Arrays.stream(numbers)
//                .min((a,b) -> Integer.compare(a,b))
//                .get();

        //numbers -> Collections.min(List.of(numbers));


        System.out.println(getMinNumber.apply(numbersArr));
    }
}
