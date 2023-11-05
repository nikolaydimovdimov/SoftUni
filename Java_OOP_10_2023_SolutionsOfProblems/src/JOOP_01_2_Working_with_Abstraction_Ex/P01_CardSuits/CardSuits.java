package JOOP_01_2_Working_with_Abstraction_Ex.P01_CardSuits;

public enum CardSuits {
    CLUBS,
    DIAMONDS,
    HEARTS,
    SPADES;


    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s",
                this.ordinal(),this.name());
    }
}
