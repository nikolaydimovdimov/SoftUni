package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> stackCalc = new ArrayDeque<>();
        String[] mathExpression = scanner.nextLine().split("\\s+");
        for (int i = mathExpression.length - 1; i >= 0; i--) {
            stackCalc.push(mathExpression[i]);
        }

        while (stackCalc.size() > 1) {
            int numbFirst = Integer.parseInt(stackCalc.pop());
            String operator = stackCalc.pop();
            int numbSecond = Integer.parseInt(stackCalc.pop());
            if (operator.equals("+")) {
                stackCalc.push(String.valueOf(numbFirst + numbSecond));
            } else {
                stackCalc.push(String.valueOf(numbFirst - numbSecond));
            }
        }
        System.out.println(stackCalc.peek());
    }
}
