package JADV9_3_Retake_Exam_12_Apri_2023;

import java.util.*;

public class P01_RubberDuckDebuggers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> timesQueue = new ArrayDeque<>();
        Deque<Integer> tacksStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(timesQueue::offer);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .forEach(tacksStack::push);


        Map<String, Integer> duckysNumbersMap = new LinkedHashMap<>();
        duckysNumbersMap.put("Darth Vader Ducky", 0);
        duckysNumbersMap.put("Thor Ducky", 0);
        duckysNumbersMap.put("Big Blue Rubber Ducky", 0);
        duckysNumbersMap.put("Small Yellow Rubber Ducky", 0);

        Map<Integer, String> timesAndDuckysMap = new LinkedHashMap<>();
        timesAndDuckysMap.put(60, "Darth Vader Ducky");
        timesAndDuckysMap.put(120, "Thor Ducky");
        timesAndDuckysMap.put(180, "Big Blue Rubber Ducky");
        timesAndDuckysMap.put(240, "Small Yellow Rubber Ducky");

        while (!(timesQueue.isEmpty() || tacksStack.isEmpty())) {
            int time = timesQueue.poll();
            int tacks = tacksStack.pop();

            int calculatedTime = time * tacks;
            boolean duckyFounded = false;

            for (Map.Entry<Integer, String> times : timesAndDuckysMap.entrySet()) {
                if (calculatedTime <= times.getKey()) {
                    int value = duckysNumbersMap.get(times.getValue()) + 1;
                    duckysNumbersMap.put(times.getValue(), value);
                    duckyFounded = true;
                    break;
                }
            }
            if (!duckyFounded) {
                tacks -= 2;
                tacksStack.push(tacks);
                timesQueue.offer(time);
            }

        }

        System.out.println("Congratulations, all tasks have been completed! Rubber ducks rewarded:");

        duckysNumbersMap.forEach((ducky, number) -> System.out.printf("%s: %d%n", ducky, number));
    }
}
