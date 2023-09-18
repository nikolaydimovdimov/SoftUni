package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDecimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stackBinaryNumber = new ArrayDeque<>();
        stackBinaryNumber.push(numberDecimal % 2);
        numberDecimal /= 2;
        while (numberDecimal > 0) {
            stackBinaryNumber.push(numberDecimal % 2);
            numberDecimal /= 2;
        }
        for (Integer num : stackBinaryNumber) {
            System.out.print(num);
        }
//        System.out.println(stackBinaryNumber.toString().replaceAll("[\\[\\], ]",""));
    }
}
