package JADV5_2_Ex_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P06_PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfNames = Integer.parseInt(scanner.nextLine());

        Predicate<String> isShorterName = name -> name.length() <= lengthOfNames;

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(isShorterName)
                .forEach(name -> System.out.println(name));


    }
}
