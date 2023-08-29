package P06LAB_Nested_Loop;

public class P02_MultiplicationTable {
    public static void main(String[] args) {
        for (int number1 = 1; number1 <= 10; number1++) {
            for (int number2 = 1; number2 <= 10; number2++) {
                System.out.printf("%d * %d = %d%n", number1, number2, number1 * number2);
            }

        }
    }
}
