package JADV3_2_Ex_Sets_and_Maps_Advanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sizeLine = scanner.nextLine().split(" ");
        int n = Integer.parseInt(sizeLine[0]);
        int m = Integer.parseInt(sizeLine[1]);
        Set<Integer> numbresFirstSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            numbresFirstSet.add(Integer.parseInt(scanner.nextLine()));
        }
        Set<Integer> numbresSecondSet = new LinkedHashSet<>();
        for (int i = 0; i < m; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            numbresSecondSet.add(currentNumber);
        }
        numbresFirstSet.retainAll(numbresSecondSet);
        System.out.println(numbresFirstSet.toString().replaceAll("[\\[\\],]", ""));
    }
}
