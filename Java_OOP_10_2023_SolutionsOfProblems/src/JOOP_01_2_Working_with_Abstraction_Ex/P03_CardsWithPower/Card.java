package JOOP_01_2_Working_with_Abstraction_Ex.P03_CardsWithPower;

public class Card {
    private CardSuits suit;
    private CardRanks rank;

    public Card(CardSuits suit, CardRanks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public int cardPower(){
        return this.suit.getPower()+this.rank.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
               this.rank.name(),this.suit.name(),this.cardPower());
    }
}
