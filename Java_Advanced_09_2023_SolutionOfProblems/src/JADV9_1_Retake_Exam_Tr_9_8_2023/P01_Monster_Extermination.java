package JADV9_1_Retake_Exam_Tr_9_8_2023;

import java.util.*;

public class P01_Monster_Extermination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> monstersArmorQueue = new ArrayDeque<>();
        Deque<Integer> soldierStrikeStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .forEach(monstersArmorQueue::offer);
        Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .forEach(soldierStrikeStack::push);

        int killedMonsters = 0;

        while (monstersArmorQueue.size() > 0 && soldierStrikeStack.size() > 0) {

            int monsterArmor = monstersArmorQueue.poll();
            int soldierStrike = soldierStrikeStack.pop();

            if (soldierStrike > monsterArmor) {
                killedMonsters++;
                soldierStrike -= monsterArmor;
                if (!soldierStrikeStack.isEmpty()) soldierStrike += soldierStrikeStack.pop();
                soldierStrikeStack.push(soldierStrike);
            } else if (soldierStrike < monsterArmor) {
                monsterArmor -= soldierStrike;
                monstersArmorQueue.offer(monsterArmor);
            } else {
                killedMonsters++;
            }
        }

        if (monstersArmorQueue.isEmpty()) {
            System.out.println("All monsters have been killed!");
        }
        if (soldierStrikeStack.isEmpty()) {
            System.out.println("The soldier has been defeated.");
        }
        System.out.printf("Total monsters killed: %d%n", killedMonsters);
    }
}
