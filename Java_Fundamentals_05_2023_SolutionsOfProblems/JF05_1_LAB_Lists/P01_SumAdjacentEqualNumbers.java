package JF05_1_LAB_Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());

        for (int i = 0; i < numbersList.size() - 1; i++) {
            if (numbersList.get(i).equals(numbersList.get(i + 1))) {
                numbersList.set(i, (numbersList.get(i) + numbersList.get(i + 1)));
                numbersList.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinDoubleListByDelimiter(numbersList, " "));
    }

    public static String joinDoubleListByDelimiter(List<Double> numList, String delimiter) {
        DecimalFormat doubleFormat = new DecimalFormat("0.##");
        String newString = "";
        for (Double aDouble : numList) {
            newString += doubleFormat.format(aDouble) + delimiter;
        }
        return newString;
    }
}
