package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_3_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine().replaceAll(" ", "");
        System.out.println(inputLine);

        List<Integer> numbersList = Arrays
                .stream(inputLine.split("\\|"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Collections.reverse(numbersList);

        inputLine = numbersList.toString().replaceAll("[\\[\\], ]", "");

        numbersList = Arrays
                .stream(inputLine.split(""))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        inputLine = numbersList.toString().replaceAll("[\\[\\],]", "");
        System.out.println(inputLine);
    }
}
