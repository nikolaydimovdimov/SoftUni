package P04_AdditionalProblems_FOR_Loop;

public class P09_Clock {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.printf("%01d : %01d%n", hour, minute);
            }
        }
    }
}
