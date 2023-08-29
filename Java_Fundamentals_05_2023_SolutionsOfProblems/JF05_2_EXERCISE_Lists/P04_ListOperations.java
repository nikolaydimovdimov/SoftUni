package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String operation = scanner.nextLine();
        while (!operation.equals("End")) {
            String[] operationItems = operation.split(" ");

            if (operation.contains("Add")) {
                numbersList.add(Integer.parseInt(operationItems[1]));
            } else if (operation.contains("Insert")) {
                int index = Integer.parseInt(operationItems[2]);

                if (isIndexValid(numbersList, index)) {
                    numbersList.add(index, Integer.parseInt(operationItems[1]));
                } else {
                    System.out.println("Invalid index");
                }

            } else if (operation.contains("Remove")) {
                int index = Integer.parseInt(operationItems[1]);

                if (isIndexValid(numbersList, index)) {
                    numbersList.remove(index);
                } else {
                    System.out.println("Invalid index");
                }

            } else if (operation.contains("left")) {
                int count = Integer.parseInt(operationItems[2]);

                for (int i = 0; i < count; i++) {
                    int saveEl = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(saveEl);
                }

            } else {
                int count = Integer.parseInt(operationItems[2]);

                for (int i = 0; i < count; i++) {
                    int saveEl = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, saveEl);
                }

            }

            operation = scanner.nextLine();
        }

        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static boolean isIndexValid(List<Integer> intList, int index) {
        return (index >= 0 && index <= intList.size());
    }
}
