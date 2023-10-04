package JADV5_2_Ex_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

public class P05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divider = Integer.parseInt(scanner.nextLine());

        Predicate<Integer> isDivideToInt = checkingDivide(divider);
                                            //n -> n % divider == 0;
        Consumer<List<Integer>> printList = numbers -> System.out.println(numbers.toString()
                .replaceAll("[\\[\\],]", ""));

        numberList = numberList.stream().filter(not(isDivideToInt)).collect(Collectors.toList());
//        numberList.removeIf(isDivideToInt);


        Collections.reverse(numberList);

        printList.accept(numberList);


    }


    private static Predicate<Integer> checkingDivide(int n) {
        return num -> num % n == 0;
    }
}
