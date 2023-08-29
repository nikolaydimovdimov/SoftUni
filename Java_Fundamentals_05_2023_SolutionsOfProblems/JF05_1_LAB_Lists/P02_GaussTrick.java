package JF05_1_LAB_Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02_GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputString = scanner.nextLine().split(" ");
        List<Integer> numberList = new ArrayList<>();
        for (String s : inputString) {
            numberList.add(Integer.parseInt(s));
        }

        for (int i = 0; i < numberList.size() - 1; i++) {
            numberList.set(i, numberList.get(i) + numberList.get(numberList.size() - 1));
            numberList.remove(numberList.size() - 1);
        }
        System.out.println(joinIntegerListByDelimiter(numberList, " "));
    }

    public static String joinIntegerListByDelimiter(List<Integer> numList, String delimiter) {
        String outputString = "";
        for (Integer ia : numList) {
            outputString += ia + delimiter;
        }
        return outputString;
    }
}
