package JOOP_01_2_Working_with_Abstraction_Ex.P06_GreedyTimes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long capacity = Long.parseLong(scanner.nextLine());
        Deque<String> safeQueue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(safeQueue::offer);
        Bag bag = new Bag(capacity);

        while (!safeQueue.isEmpty()) {
            String item = safeQueue.poll();
            long quantity = Long.parseLong(Objects.requireNonNull(safeQueue.poll()));
            bag.putInBag(item, quantity);
        }

        System.out.println(bag);
    }
}