package JOOP_01_1_Working_with_Abstraction_Lab.P04_Hotel_Reservation;


public class PriceCalculator {



    public static double calculate(double pricePerDay, int numberOfDays,
                            Season season, Discount discountType) {
        return pricePerDay * numberOfDays * season.getValue() * (100-discountType.getValue()) / 100;

    }

}
