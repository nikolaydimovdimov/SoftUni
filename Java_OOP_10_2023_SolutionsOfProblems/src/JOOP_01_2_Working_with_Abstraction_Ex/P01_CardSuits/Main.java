package JOOP_01_2_Working_with_Abstraction_Ex.P01_CardSuits;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");
        CardSuits[] cardSuits=CardSuits.values();
        Arrays.stream(cardSuits).forEach(System.out::println);
    }
}
