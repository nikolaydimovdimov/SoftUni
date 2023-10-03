package JADV5_2_Ex_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

//        Function<Integer, Integer> adds1ToNumber = n -> n + 1;
        Function<List<Integer>, List<Integer>> adds1ToList = numbers -> numbers.stream()
                .map(n -> n + 1).collect(Collectors.toList());

//        Function<Integer, Integer> multiplyBy2Number = n -> n * 2;
        Function<List<Integer>, List<Integer>> multiplyBy2List = numbers -> numbers.stream()
                .map(n -> n * 2).collect(Collectors.toList());

//        Function<Integer, Integer> subtract1Number = n -> n - 1;
        Function<List<Integer>, List<Integer>> subtract1List = numbers -> numbers.stream()
                .map(n -> n - 1).collect(Collectors.toList());

        Consumer<List<Integer>> printList = numbers -> System.out.println(numbers.toString()
                .replaceAll("[\\[\\],]", ""));

        String command = scanner.nextLine();

        while (!command.equals("end")) {

            if (command.equals("add")) {
                numbersList = adds1ToList.apply(numbersList);
            } else if (command.equals("subtract")) {
                numbersList = subtract1List.apply(numbersList);
            } else if (command.equals("multiply")) {
                numbersList = multiplyBy2List.apply(numbersList);
            } else if (command.equals("print")) {
                printList.accept(numbersList);
            }

            command = scanner.nextLine();
        }

    }
}
