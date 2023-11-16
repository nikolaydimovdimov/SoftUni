package JOOP_02_2_Encapsulation_Ex.P04_Pizza_Calories;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int number) {
        this.setName(name);
        this.setToppings(number);
        this.toppings = new ArrayList<>();
    }

    private void setToppings(int number) {
        if (number < 0 || number > 10) {
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }

    }

    private void setName(String name) {
        if (name.trim().isEmpty() || name.trim().length() > 15) {
            throw new IllegalArgumentException("JOOP_02_2_Encapsulation_Ex.P04_Pizza_Calories.Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name.trim();
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public double getOverallCalories() {
        double overallCalories = this.dough.calculateCalories();
        for (Topping topping : toppings) {
            overallCalories += topping.calculateCalories();
        }
        return overallCalories;
    }
}
