package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02_ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals(("end"))) {
            int element = Integer.parseInt(command.split(" ")[1]);

            if (command.contains("Delete")) {
                numbersList.removeIf(el -> el == element);
            } else {
                int position = Integer.parseInt(command.split(" ")[2]);
                numbersList.add(position, element);
            }

            command = scanner.nextLine();
        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}
