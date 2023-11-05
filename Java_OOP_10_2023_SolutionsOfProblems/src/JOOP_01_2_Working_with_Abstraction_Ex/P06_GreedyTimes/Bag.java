package JOOP_01_2_Working_with_Abstraction_Ex.P06_GreedyTimes;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bag {
    private long gold;
    private Map<String, Long> gemsMap;
    private Map<String, Long> moneyMap;
    private long capacity;
    private long currentAmount;
    private long gemsAmount;
    private long moneyAmount;

    public Bag(long capacity) {
        this.gemsMap = new LinkedHashMap<>();
        this.moneyMap = new LinkedHashMap<>();
        this.gold = 0L;
        this.capacity = capacity;
        this.currentAmount = 0L;
        this.gemsAmount = 0L;
        this.moneyAmount = 0L;
    }

    public void putInBag(String item, long quantity) {
        if (this.currentAmount + quantity > this.capacity) return;
        if ((item.length() == 3) &&
                (this.moneyAmount + quantity <= this.gemsAmount)) {

            this.currentAmount += quantity;
            this.moneyAmount += quantity;

            this.moneyMap.putIfAbsent(item, 0L);
            this.moneyMap.put(item, moneyMap.get(item) + quantity);

        } else if ((item.length() > 3) &&
                (item.toLowerCase().endsWith("gem")) &&
                (this.gemsAmount + quantity <= this.gold)) {

            this.currentAmount += quantity;
            this.gemsAmount += quantity;
            for (Map.Entry<String, Long> gem : this.gemsMap.entrySet()) {
                if (gem.getKey().equalsIgnoreCase(item)) item = gem.getKey();
            }
            this.gemsMap.putIfAbsent(item, 0L);
            this.gemsMap.put(item, gemsMap.get(item) + quantity);

        } else if (item.equalsIgnoreCase("gold")) {

            this.currentAmount += quantity;
            this.gold += quantity;

        }
    }

    @Override
    public String toString() {
        if (this.gold == 0) return "";
        StringBuilder output = new StringBuilder();
        output.append("<Gold> $").append(this.gold).append(System.lineSeparator());
        output.append("##Gold - ").append(this.gold).append(System.lineSeparator());
        if (!this.gemsMap.isEmpty()) {
            output.append("<Gem> $").append(this.gemsAmount).append(System.lineSeparator());
            this.gemsMap.entrySet().stream().sorted((item1, item2) -> item2.getKey().compareTo(item1.getKey()))
                    .forEach(item -> output.append("##").append(item.getKey()).append(" - ").append(item.getValue())
                            .append(System.lineSeparator()));
        }
        if (!this.moneyMap.isEmpty()) {
            output.append("<Cash> $").append(this.moneyAmount).append(System.lineSeparator());
            this.moneyMap.entrySet().stream().sorted((item1, item2) -> item2.getKey().compareTo(item1.getKey()))
                    .forEach(item -> output.append("##").append(item.getKey()).append(" - ").append(item.getValue())
                            .append(System.lineSeparator()));
        }
        return output.toString().trim();
    }
}
