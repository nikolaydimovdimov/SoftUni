package JADV1_2_Ex_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class P01_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stackNumbers = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(stackNumbers::push);

        while (!stackNumbers.isEmpty()) {
            System.out.print(stackNumbers.pop() + " ");
        }

    }
}
