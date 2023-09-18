package JADV1_2_Ex_STACKS_and_QUEUES;

import java.util.Scanner;

public class P06_RecursiveFibonacci {
    public static long[] fibValues;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        fibValues = new long[n + 1];

        System.out.println(fib(n));
    }

    public static long fib(int n) {
        long result = 0;
        if (fibValues[n] != 0) {
            return fibValues[n];
        }
        if (n < 2) {
            result = 1;
        } else {
            result = fib(n - 1) + fib(n - 2);
        }
        fibValues[n] = result;
        return result;
    }
}
