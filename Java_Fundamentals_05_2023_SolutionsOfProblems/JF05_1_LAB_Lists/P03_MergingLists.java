package JF05_1_LAB_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        if (firstList.size() >= secondList.size()) {
            for (int i = 0; i < secondList.size(); i++) {
                firstList.add((2 * i + 1), secondList.get(i));
            }
            System.out.println(firstList.toString().replaceAll("[\\[\\],]", ""));
        } else {
            for (int i = 0; i < firstList.size(); i++) {
                secondList.add((2 * i), firstList.get(i));
            }
            System.out.println(secondList.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
