package JOOP_01_2_Working_with_Abstraction_Ex.P02_CardRank;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CardRanks[] cardRanks=CardRanks.values();
        System.out.println("Card Ranks:");
        Arrays.stream(cardRanks).forEach(System.out::println);
    }
}
