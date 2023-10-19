package JADV9_2_Exam_Tr_17_June_2023;

import java.util.*;
import java.util.stream.Collectors;

public class P01_TempleOfDoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> toolsQueue = new ArrayDeque<>();
        Deque<Integer> substancesStack = new ArrayDeque<>();


        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(toolsQueue::offer);

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(substancesStack::push);

        List<Integer> challengesList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        while (!(toolsQueue.isEmpty() || substancesStack.isEmpty() || challengesList.isEmpty())) {

            int tool = toolsQueue.poll();
            int substance = substancesStack.pop();
            int magic = tool * substance;

            if (challengesList.contains(magic)) {
                challengesList.remove(Integer.valueOf(magic));
            } else {
                toolsQueue.offer(++tool);
                if (--substance > 0) substancesStack.push(substance);
            }
        }

        if (challengesList.isEmpty()) {
            System.out.println("Harry found an ostracon, which is dated to the 6th century BCE.");
        } else {
            System.out.println("Harry is lost in the temple. Oblivion awaits him.");
        }

        if (!toolsQueue.isEmpty()) {
            System.out.println("Tools: " + toolsQueue.toString()
                    .replaceAll("[\\[\\]]", ""));
        }

        if (!substancesStack.isEmpty()) {
            System.out.println("Substances: " + substancesStack.toString()
                    .replaceAll("[\\[\\]]", ""));
        }

        if (!challengesList.isEmpty()) {
            System.out.println("Challenges: " + challengesList.toString()
                    .replaceAll("[\\[\\]]", ""));
        }

    }

}
