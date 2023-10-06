package JADV5_2_Ex_Functional_Programming;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P08_CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Comparator<Integer> evenBeforeOddSorted = (a, b) -> {

            if (a % 2 != 0 && b % 2 == 0) return 1;
            if (a % 2 == 0 && b % 2 != 0) return -1;

            return a.compareTo(b);
            //Integer.compare(a,b);
        };

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(evenBeforeOddSorted)
                .forEach(e -> System.out.print(e + " "));
    }
}
