package JADV3_2_Ex_Sets_and_Maps_Advanced;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elementsSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            Collections.addAll(elementsSet, line);
        }

        System.out.println(String.join(" ", elementsSet));
    }
}
