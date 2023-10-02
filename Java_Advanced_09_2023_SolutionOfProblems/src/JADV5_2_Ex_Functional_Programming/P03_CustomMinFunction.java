package JADV5_2_Ex_Functional_Programming;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> getMinNumber = numbers -> Collections.min(numbers);

        System.out.println(getMinNumber.apply(numbersArr));
    }
}
