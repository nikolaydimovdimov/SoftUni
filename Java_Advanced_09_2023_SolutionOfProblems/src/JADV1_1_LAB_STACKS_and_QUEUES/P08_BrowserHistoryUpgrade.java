package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stackUrlsBack = new ArrayDeque<>();
        ArrayDeque<String> stackUrlsForward = new ArrayDeque<>();
        String instruction = scanner.nextLine();
        while (!instruction.equals("Home")) {
            if (instruction.equals("back")) {
                if (stackUrlsBack.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    stackUrlsForward.push(stackUrlsBack.pop());
                    System.out.println(stackUrlsBack.peek());
                }
            } else if (instruction.equals("forward")) {
                if (stackUrlsForward.isEmpty()) {
                    System.out.println("no next URLs");
                } else {
                    stackUrlsBack.push(stackUrlsForward.pop());
                    System.out.println(stackUrlsBack.peek());
                }
            } else {
                System.out.println(instruction);
                stackUrlsBack.push(instruction);
                stackUrlsForward.clear();
            }
            instruction = scanner.nextLine();
        }
    }
}



