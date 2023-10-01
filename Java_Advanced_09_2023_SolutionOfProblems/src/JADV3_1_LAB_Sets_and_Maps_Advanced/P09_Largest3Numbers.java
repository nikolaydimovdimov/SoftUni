package JADV3_1_LAB_Sets_and_Maps_Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P09_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());


        int count = 0;
        for (Integer numb : numbersList) {
            System.out.print(numb + " ");
            count++;
            if (count == 3) break;
        }
    }
}
