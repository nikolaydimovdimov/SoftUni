package JF3_2_EXERCISE_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P09_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numberArray = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String command = scanner.nextLine();
        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int saver = numberArray[Integer.parseInt(command.split(" ")[1])];
                numberArray[Integer.parseInt(command.split(" ")[1])] =
                        numberArray[Integer.parseInt(command.split(" ")[2])];
                numberArray[Integer.parseInt(command.split(" ")[2])] = saver;
            } else if (command.contains("multiply")) {
                numberArray[Integer.parseInt(command.split(" ")[1])] *=
                        numberArray[Integer.parseInt(command.split(" ")[2])];
            } else if (command.contains("decrease")) {
                for (int i = 0; i < numberArray.length; i++) {
                    numberArray[i]--;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println(Arrays
                .toString(numberArray)
                .replace("[", "")
                .replace("]", ""));
    }
}
