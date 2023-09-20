package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stackUrls = new ArrayDeque<>();
        String instruction = scanner.nextLine();
        while (!instruction.equals("Home")) {
            if (instruction.equals("back")) {
                if (stackUrls.size() < 2) {
                    System.out.println("no previous URLs");
                } else {
                    stackUrls.pop();
                    System.out.println(stackUrls.peek());
                }
            } else {
                System.out.println(instruction);
                stackUrls.push(instruction);
            }
            instruction = scanner.nextLine();
        }
    }
}
