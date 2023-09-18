package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P06_HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kids = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queueKidsInGame = new ArrayDeque<>();
        for (String kid : kids) {
            queueKidsInGame.offer(kid);
        }
        while (queueKidsInGame.size() > 1) {
            for (int i = 1; i < n; i++) {
                queueKidsInGame.offerLast(queueKidsInGame.poll());
            }
            System.out.printf("Removed %s%n", queueKidsInGame.poll());
        }
        System.out.printf("Last is %s%n", queueKidsInGame.peek());
    }
}
