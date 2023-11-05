package JOOP_01_2_Working_with_Abstraction_Ex.P02_CardRank;

public enum CardRanks {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s",
                this.ordinal(),this.name());
    }
}
