package JF05_1_LAB_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersIntList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandElements = command.split(" ");
            if (commandElements[0].equals("Contains")) {
                if (numbersIntList.contains(Integer.parseInt(commandElements[1]))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (commandElements[0].equals("Print")) {
                if (commandElements[1].equals("even")) {
                    for (Integer el : numbersIntList) {
                        if (el % 2 == 0) {
                            System.out.print(el + " ");
                        }
                    }
                } else {
                    for (Integer el : numbersIntList) {
                        if (el % 2 != 0) {
                            System.out.print(el + " ");
                        }
                    }
                }
                System.out.println();
            } else if (commandElements[0].equals("Get")) {
                int sum = 0;
                for (Integer el : numbersIntList) {
                    sum += el;
                }
                System.out.println(sum);
            } else {
                switch (commandElements[1]) {
                    case "<":
                        for (Integer el : numbersIntList) {
                            if (el < Integer.parseInt(commandElements[2])) {
                                System.out.print(el + " ");
                            }
                        }
                        break;
                    case ">":
                        for (Integer el : numbersIntList) {
                            if (el > Integer.parseInt(commandElements[2])) {
                                System.out.print(el + " ");
                            }
                        }
                        break;
                    case ">=":
                        for (Integer el : numbersIntList) {
                            if (el >= Integer.parseInt(commandElements[2])) {
                                System.out.print(el + " ");
                            }
                        }
                        break;
                    case "<=":
                        for (Integer el : numbersIntList) {
                            if (el <= Integer.parseInt(commandElements[2])) {
                                System.out.print(el + " ");
                            }
                        }
                        break;
                }
                System.out.println();
            }
            command = scanner.nextLine();
        }
    }
}
