package JADV8_1_Generics_BOX;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCompareTo_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<BoxC<String>> dataList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            dataList.add(new BoxC<>(scanner.nextLine()));
        }

        System.out.println(countBiggerElements(dataList, new BoxC<>(scanner.nextLine())));

    }

    private static <T extends Comparable<T>> int countBiggerElements(List<T> data, T standart) {
        int count = 0;
        for (T d : data) {
            if (d.compareTo(standart) > 0) count++;
        }
        return count;
    }
}
