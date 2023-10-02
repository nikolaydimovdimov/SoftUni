package JADV5_1_LAB_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P04_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] price = Arrays.stream(scanner.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        UnaryOperator<Double> addVat = num -> num * 1.2;

        System.out.println("Prices with VAT:");
        Arrays.stream(price).forEach(pr -> System.out.printf("%.2f%n", addVat.apply(pr)));

    }

}
