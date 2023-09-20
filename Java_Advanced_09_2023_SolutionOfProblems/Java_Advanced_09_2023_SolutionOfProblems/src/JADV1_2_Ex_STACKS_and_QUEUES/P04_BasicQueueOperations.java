package JADV1_2_Ex_STACKS_and_QUEUES;

import java.util.*;

public class P04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] commands = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int n = commands[0];
        int s = commands[1];
        int x = commands[2];

        Deque<Integer> queueNumbers = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            queueNumbers.offer(numbers[i]);
        }
        for (int i = 0; i < s; i++) {
            queueNumbers.poll();
        }
        if (queueNumbers.isEmpty()) {
            System.out.println(0);
        } else {
            if (queueNumbers.contains(x)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queueNumbers));
            }
        }
    }
}
