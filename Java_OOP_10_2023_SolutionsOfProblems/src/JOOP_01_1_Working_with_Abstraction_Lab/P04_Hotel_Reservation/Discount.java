package JOOP_01_1_Working_with_Abstraction_Lab.P04_Hotel_Reservation;

public enum Discount {
    NONE(0), SECOND_VISIT(10), VIP(20);
    private int value;

    Discount(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
