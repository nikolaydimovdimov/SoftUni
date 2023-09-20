package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        ArrayDeque<String> queuePrinter = new ArrayDeque<>();

        while (!command.equals("print")) {
            if (command.equals(("cancel"))) {
                if (queuePrinter.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.printf("Canceled %s%n", queuePrinter.poll());
                }
            } else {
                queuePrinter.offer(command);
            }
            command = scanner.nextLine();
        }
        System.out.println(String.join(System.lineSeparator(), queuePrinter));
    }
}
