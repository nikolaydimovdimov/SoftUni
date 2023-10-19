package JADV8_2_Generics_CUSTOM_LIST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CustomList<String> elementsList = new CustomList<>();

        String[] input = scanner.nextLine().split("\\s+");

        while (!input[0].equals("END")) {

            switch (input[0]) {

                case "Add":
                    elementsList.add(input[1]);
                    break;
                case "Remove":
                    elementsList.remove(Integer.parseInt(input[1]));
                    break;
                case "Contains":
                    System.out.println(elementsList.contains(input[1]));
                    break;
                case "Swap":
                    elementsList.swap(Integer.parseInt(input[1]), Integer.parseInt(input[2]));
                    break;
                case "Greater":
                    System.out.println(elementsList.countGreater(input[1]));
                    break;
                case "Max":
                    System.out.println(elementsList.getMax());
                    break;
                case "Min":
                    System.out.println(elementsList.getMin());
                    break;
                case "Sort":
                    Sorter.sort(elementsList);
                    break;
                case "Print":
                    for (Object str : elementsList) {
                        System.out.println(str);
                    }
                    break;
            }
            input = scanner.nextLine().split("\\s+");
        }
    }

}
