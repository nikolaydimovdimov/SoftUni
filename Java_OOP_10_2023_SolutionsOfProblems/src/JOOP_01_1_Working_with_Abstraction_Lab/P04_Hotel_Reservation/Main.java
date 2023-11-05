package JOOP_01_1_Working_with_Abstraction_Lab.P04_Hotel_Reservation;

import java.util.Scanner;

import static JOOP_01_1_Working_with_Abstraction_Lab.P04_Hotel_Reservation.PriceCalculator.calculate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");

        double pricePerDay=Double.parseDouble(input[0]);
        int numberOfDays=Integer.parseInt(input[1]);

//        PriceCalculator priceCalculator=new PriceCalculator();

        String season=input[2].toUpperCase();
        String discountType=input[3].toUpperCase();
        if(discountType.equals("SECONDVISIT")) discountType="SECOND_VISIT";

        System.out.printf("%.2f%n",calculate(pricePerDay,numberOfDays,
                Season.valueOf(season),Discount.valueOf(discountType)));

    }
}
