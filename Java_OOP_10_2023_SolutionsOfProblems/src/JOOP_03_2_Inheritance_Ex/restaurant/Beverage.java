package JOOP_03_2_Inheritance_Ex.restaurant;

import java.math.BigDecimal;

public class Beverage extends Product {
    private double milliliters;

    public Beverage(String name, BigDecimal price, double milliliters) {
        super(name, price);
        this.milliliters = milliliters;
    }


    public double getMilliliters() {
        return milliliters;
    }
}
