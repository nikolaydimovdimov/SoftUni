package JF05_1_LAB_Lists;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numIntList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");
            switch (commandElements[0]) {
                case "Add":
                    numIntList.add(Integer.parseInt(commandElements[1]));
                    break;
                case "Remove":
//                    numIntList.remove(Integer.valueOf(Integer.parseInt(commandElements[1])));
                    numIntList.remove(makeIntObj(Integer.parseInt(commandElements[1])));
                    break;
                case "RemoveAt":
                    numIntList.remove(Integer.parseInt(commandElements[1]));
                    break;
                case "Insert":
                    numIntList.add(Integer.parseInt(commandElements[2]), Integer.parseInt(commandElements[1]));
                    break;
            }
            command = scanner.nextLine();
        }

        System.out.println(numIntList.toString().replaceAll("[\\[\\],]", ""));
    }

    public static Integer makeIntObj(int i) {
        return i;
    }
}
