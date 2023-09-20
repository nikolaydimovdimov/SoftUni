package JADV1_2_Ex_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class P03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stackNumbers = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            switch (command[0]) {
                case "1":
                    stackNumbers.push(Integer.parseInt(command[1]));
                    break;
                case "2":
                    stackNumbers.pop();
                    break;
                case "3":
                    System.out.println(Collections.max(stackNumbers));
                    break;
            }
        }
    }
}
