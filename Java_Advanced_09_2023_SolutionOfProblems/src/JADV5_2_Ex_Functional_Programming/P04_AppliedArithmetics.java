package JADV5_2_Ex_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P04_AppliedArithmetics {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList= Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command=scanner.nextLine();

        while (!command.equals("end")){

        }


    }


}
