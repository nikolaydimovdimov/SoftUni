package JF05_2_EXERCISE_Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10_SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lessonsList = Arrays
                .stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            if (command.contains("Add")) {
                String[] commandElem = command.split(":");
                if (!lessonsList.contains(commandElem[1])) {
                    lessonsList.add(commandElem[1]);
                }
            } else if (command.contains(("Insert"))) {
                String[] commandElem = command.split(":");
                if (!lessonsList.contains(commandElem[1])) {
                    lessonsList.add(Integer.parseInt(commandElem[2]), commandElem[1]);
                }
            } else if (command.contains("Remove")) {
                String[] commandElem = command.split(":");
                if (lessonsList.contains(commandElem[1])) {
                    lessonsList.remove(commandElem[1]);
                }

            } else if (command.contains(("Swap"))) {
                String[] commandElem = command.split(":");
                if (lessonsList.contains(commandElem[1]) && lessonsList.contains(commandElem[2])) {
                    int ind1 = lessonsList.indexOf(commandElem[1]);
                    int ind2 = lessonsList.indexOf(commandElem[2]);
                    lessonsList.set(ind1, commandElem[2]);
                    lessonsList.set(ind2, commandElem[1]);
                    if (lessonsList.contains(commandElem[1] + "-Exercise")) {
                        lessonsList.remove(commandElem[1] + "-Exercise");
                        if (ind2 < lessonsList.size() - 1) {
                            lessonsList.add(ind2 + 1, commandElem[1] + "-Exercise");
                        } else {
                            lessonsList.add(commandElem[1] + "-Exercise");
                        }
                    }
                    if (lessonsList.contains(commandElem[2] + "-Exercise")) {
                        lessonsList.remove(commandElem[2] + "-Exercise");
                        if (ind1 < lessonsList.size() - 1) {
                            lessonsList.add(ind1 + 1, commandElem[2] + "-Exercise");
                        } else {
                            lessonsList.add(commandElem[2] + "-Exercise");
                        }
                    }
                }
            } else if (command.contains("Exercise")) {
                String[] commandElem = command.split(":");
                if (lessonsList.contains(commandElem[1]) && !lessonsList.contains(commandElem[1] + "-Exercise")) {
                    int ind = lessonsList.indexOf(commandElem[1]) + 1;
                    lessonsList.add(ind, commandElem[1] + "-Exercise");
                } else if (!lessonsList.contains(commandElem[1])) {
                    lessonsList.add(commandElem[1]);
                    lessonsList.add(commandElem[1] + "-Exercise");
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < lessonsList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, lessonsList.get(i));
        }
    }
}

