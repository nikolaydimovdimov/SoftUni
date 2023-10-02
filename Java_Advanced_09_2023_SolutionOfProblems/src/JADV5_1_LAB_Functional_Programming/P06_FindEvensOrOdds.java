package JADV5_1_LAB_Functional_Programming;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class P06_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split((" "));
        int lowerBond = Integer.parseInt(input[0]);
        int upperBond = Integer.parseInt(input[1]);
        String numberType = scanner.nextLine();
        Predicate<Integer> isEven = number -> number % 2 == 0;

        List<Integer> numbers = new LinkedList<>();
        for (int i = lowerBond; i <= upperBond; i++) {
            if ((numberType.equals("even") && isEven.test(i)) ||
                    (numberType.equals("odd") && !isEven.test(i)))
                numbers.add(i);
        }
        System.out.println(numbers.toString().replaceAll("[\\[\\],]", ""));
    }


}
