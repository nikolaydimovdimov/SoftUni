package JOOP_01_2_Working_with_Abstraction_Ex.P03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CardRanks rank=CardRanks.valueOf(scanner.nextLine());
        CardSuits suit=CardSuits.valueOf(scanner.nextLine());
        Card card=new Card(suit,rank);
        System.out.println(card);
    }
}
