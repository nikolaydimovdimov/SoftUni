package JOOP_02_2_Encapsulation_Ex.P04_Pizza_Calories;

import java.util.Map;

public class Topping {
    private String toppingType;
    private double weight;

    private final Map<String, Double> toppingsModifiers = Map.of(
            "Meat", 1.2,
            "Veggies", 0.8,
            "Cheese", 1.1,
            "Sauce", 0.9
    );

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        if (!this.toppingsModifiers.containsKey(toppingType)) {
            throw new IllegalArgumentException(String.format("Cannot place %s on top of your pizza.%n", toppingType));
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50) {
            throw new IllegalArgumentException(String.format("%s weight should be in the range [1..50].", this.toppingType));
        }
        this.weight = weight;
    }

    public double calculateCalories() {
        return 2 * this.weight * this.toppingsModifiers.get(this.toppingType);
    }
}
