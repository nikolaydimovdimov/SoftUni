package JOOP_02_2_Encapsulation_Ex.P03_ShoppingSpree;

public class Validation {

    private Validation() {

    }
    public static void validate(String text){
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }
    public static void validate(double number){
        if (number < 0) {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }
}
