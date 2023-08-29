package JF06_1_LAB_Objects_and_Classes;

import java.math.BigInteger;
import java.util.Scanner;

public class P02_SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger numberFirst = new BigInteger(scanner.nextLine());
        BigInteger numberSecond = new BigInteger(scanner.nextLine());
        BigInteger sum = numberFirst.add(numberSecond);

        System.out.println(sum);

    }
}
