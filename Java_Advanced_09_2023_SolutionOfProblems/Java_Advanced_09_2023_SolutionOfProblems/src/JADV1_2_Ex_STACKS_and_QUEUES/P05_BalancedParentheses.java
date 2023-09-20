package JADV1_2_Ex_STACKS_and_QUEUES;

import java.util.*;

public class P05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> stackParentheses = new ArrayDeque<>();
        String[] input = scanner.nextLine().split("\\s*");
        for (int i = input.length - 1; i >= 0; i--) {
            stackParentheses.push(input[i]);
        }

        System.out.println(isBalanced(stackParentheses) ? "YES":"NO");

//        if (isBalanced(stackParentheses)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
    }

    public static boolean isBalanced(Deque<String> stackIn) {
        Deque<String> stackOpenPar = new ArrayDeque<>();

        while (!stackIn.isEmpty()) {
            if (stackIn.peek().equals("(") || stackIn.peek().equals("[") || stackIn.peek().equals("{")) {
                stackOpenPar.push(stackIn.pop());
            } else {
                if (stackOpenPar.isEmpty()) {
                    return false;
                }
                String in = stackIn.peek();
                String open = stackOpenPar.peek();
                if (in.equals(")") && open.equals("(") ||
                        in.equals("]") && open.equals("[") ||
                        in.equals("}") && open.equals("{")) {
                    stackIn.pop();
                    stackOpenPar.pop();
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}


