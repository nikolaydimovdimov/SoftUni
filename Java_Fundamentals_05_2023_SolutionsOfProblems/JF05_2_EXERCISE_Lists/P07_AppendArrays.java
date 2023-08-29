package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07_AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine()
                .replaceAll(" ", "")
                .replace('|', ',');

        List<String> inputArrays = Arrays
                .stream(line.split(","))
                .collect(Collectors.toList());

        line = "";

        for (int i = inputArrays.size() - 1; i >= 0; i--) {
            String[] elements = inputArrays.get(i).split("");

            for (String el : elements) {
                line += el + " ";
            }
        }

        System.out.println(line);
    }
}
