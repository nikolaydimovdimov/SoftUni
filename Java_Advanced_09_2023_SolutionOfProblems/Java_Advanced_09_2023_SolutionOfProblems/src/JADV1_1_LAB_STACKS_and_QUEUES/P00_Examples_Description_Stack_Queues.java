package JADV1_1_LAB_STACKS_and_QUEUES;

import java.util.*;

public class P00_Examples_Description_Stack_Queues {
    public static void main(String[] args) {


        Deque<Integer> stackNumbers = new ArrayDeque<>();
        Deque<String> queueWords = new ArrayDeque<>();

        // STACK     LIFO
        // stackName.push(element) - add new element on the TOP
        // stackName.pop() - remove element from the TOP and return value
        // stackName.peek() - return value of element on the TOP ( without removing )

        // QUEUE    FIFO
        // queueName.offer(element) - add new element at the END of queue ( after the last added element )
        // queueName.poll() - remove the first element ( at tha START of queue ) and return value
        // queueName.peek() - return value of the first element ( at tha START of queue ) ( without removing )


        // READ
        Scanner scanner = new Scanner(System.in);

        Arrays.stream(scanner.nextLine().split("\\s*"))
                .mapToInt(Integer::parseInt)
                .forEach(stackNumbers::push);

        int n= Collections.min(stackNumbers);



    }


}
