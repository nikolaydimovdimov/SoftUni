package JOOP_02_2_Encapsulation_Ex.P04_Pizza_Calories;

public enum ToppingsModifiers {
    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);

    private double value;


    ToppingsModifiers(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
