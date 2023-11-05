package JOOP_01_2_Working_with_Abstraction_Ex.P03_CardsWithPower;

public enum CardSuits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private final int power;

    CardSuits(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

}
