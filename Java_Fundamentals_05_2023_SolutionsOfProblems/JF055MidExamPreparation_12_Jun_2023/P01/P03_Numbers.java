package JF055MidExamPreparation_12_Jun_2023.P01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbersList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = 0;
        for (Integer num : numbersList) {
            sum += num;
        }
        double averageNumber = sum * 1.0 / numbersList.size();
        List<Integer> bigNumbersList = new ArrayList<>();
        boolean isThereBigNumbers = true;

        while (isThereBigNumbers && bigNumbersList.size() < 5 && !numbersList.isEmpty()) {
            int bigNumber = Integer.MIN_VALUE;
            int index = -1;
            isThereBigNumbers = false;

            for (int i = 0; i < numbersList.size(); i++) {

                if (numbersList.get(i) > averageNumber && numbersList.get((i)) > bigNumber) {
                    bigNumber = numbersList.get(i);
                    isThereBigNumbers = true;
                    index = i;
                }
            }
            if (isThereBigNumbers) {
                bigNumbersList.add(bigNumber);
                numbersList.remove(index);
            }
        }

        if (bigNumbersList.isEmpty()) {
            System.out.println("No");
        } else {
            System.out.println(bigNumbersList.toString().replaceAll("[\\[\\],]", ""));
        }

    }
}
