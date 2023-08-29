package JF05_1_LAB_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        numbersList.removeIf(el -> el < 0);
        if (numbersList.size() > 0) {
            Collections.reverse(numbersList);
            System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
        } else {
            System.out.println("empty");
        }
    }
}
