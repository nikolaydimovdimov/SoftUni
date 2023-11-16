package JOOP_04_1_Interfaces_and_Abstraction_Lab.P02_CarShopExtended;

import java.text.DecimalFormat;

public class Audi extends CarImpl implements Rentable{

    private Integer minRentDay;
    private Double pricePerDay;

    public Audi(String model, String color, Integer horsePower, String country, Integer minRentDay, Double minPricePerDay) {
        super(model, color, horsePower, country);
        this.minRentDay = minRentDay;
        this.pricePerDay = minPricePerDay;
    }


    public Integer getMinRentDay() {
        return minRentDay;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.000000");
        return super.toString() + System.lineSeparator() +
                String.format("Minimum rental period of %d days. Price per day %s",
                        this.getMinRentDay(),
                        df.format(this.getPricePerDay()));
    }
}
