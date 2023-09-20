package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07_MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] kids = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> queueKidsInGame = new ArrayDeque<>();
        int cycle = 0;
        for (String kid : kids) {
            queueKidsInGame.offer(kid);
        }
        while (queueKidsInGame.size() > 1) {
            cycle++;
            for (int i = 1; i <= n; i++) {

                queueKidsInGame.offer(queueKidsInGame.poll());
            }
            if (isPrime(cycle)) {
                System.out.printf("Prime %s%n", queueKidsInGame.peek());
            } else {
                System.out.printf("Removed %s%n", queueKidsInGame.poll());
            }
        }
        System.out.printf("Last is %s%n", queueKidsInGame.peek());
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
