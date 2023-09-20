package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mathExpression = scanner.nextLine();
        ArrayDeque<Integer> stackBracketPosition = new ArrayDeque<>();
        for (int i = 0; i < mathExpression.length(); i++) {
            if (mathExpression.charAt(i) == '(') stackBracketPosition.push(i);
            if (mathExpression.charAt(i) == ')')
                System.out.println(mathExpression.substring(stackBracketPosition.pop(), i + 1));
        }
    }
}
