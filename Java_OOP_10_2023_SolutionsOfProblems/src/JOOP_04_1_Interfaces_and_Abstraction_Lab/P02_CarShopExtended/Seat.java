package JOOP_04_1_Interfaces_and_Abstraction_Lab.P02_CarShopExtended;

import java.text.DecimalFormat;

public class Seat extends CarImpl implements Sellable {


    private Double price;

    public Seat(String model, String color, Integer horsePower, String country, Double price) {
        super(model, color, horsePower, country);
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.000000");
        return super.toString() + System.lineSeparator() +
                String.format("%s sells for %s",
                        super.getModel(),
                        df.format(this.price));

    }
}
