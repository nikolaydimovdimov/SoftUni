package JF55_Exam_18_06_2023;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> booksList = Arrays
                .stream(scanner.nextLine().split("&"))
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("Done")) {
            String[] commandEl = command.split("\\|");

            if (commandEl[0].contains("Add")) {
                String name = commandEl[1].trim();
                if (!isBookOnShelf(booksList, name)) {
                    booksList.add(0, name);
                }

            } else if (commandEl[0].contains("Take")) {
                String name = commandEl[1].trim();
                if (isBookOnShelf(booksList, name)) {
                    booksList.remove(name);
                }

            } else if (commandEl[0].contains("Swap")) {
                String name1 = commandEl[1].trim();
                String name2 = commandEl[2].trim();
                if (isBookOnShelf(booksList, name1) && isBookOnShelf(booksList, name2)) {
                    int index1 = booksList.indexOf(name1);
                    int index2 = booksList.indexOf(name2);
                    booksList.set(index1, name2);
                    booksList.set(index2, name1);
                }

            } else if (commandEl[0].contains("Insert")) {
                String name = commandEl[1].trim();
                if (!isBookOnShelf(booksList, name)) {
                    booksList.add(name);
                }

            } else if (commandEl[0].contains("Check")) {
                String name = commandEl[1].trim();
                int index = Integer.parseInt(name);
                if (isIndexValid(booksList, index)) {
                    System.out.println(booksList.get(index));
                }

            }

            command = scanner.nextLine();
        }

        System.out.println(String.join(", ", booksList));


    }

    public static boolean isBookOnShelf(List<String> sentList, String name) {
        return (sentList.contains(name));
    }

    public static boolean isIndexValid(List<String> sentList, int index) {
        return (index >= 0 && index < sentList.size());
    }

}

