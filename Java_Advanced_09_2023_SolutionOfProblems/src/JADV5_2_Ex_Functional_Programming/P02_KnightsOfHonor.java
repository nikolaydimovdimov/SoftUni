package JADV5_2_Ex_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Consumer<String> printString = str -> System.out.println("Sir " + str);
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(printString);
    }
}
