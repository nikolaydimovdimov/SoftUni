package JADV1_2_Ex_STACKS_and_QUEUES;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P06_1_Fibonacci_with_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Long> fibonacciValues = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine());
        fibonacciValues.push(0L);
        fibonacciValues.push(1L);
        for (int i = 1; i <= n; i++) {
            long number1 = fibonacciValues.pop();
            long number2 = fibonacciValues.pop();
            fibonacciValues.push(number1);
            fibonacciValues.push((number1 + number2));
        }
        System.out.println(fibonacciValues.peek());
    }
}
