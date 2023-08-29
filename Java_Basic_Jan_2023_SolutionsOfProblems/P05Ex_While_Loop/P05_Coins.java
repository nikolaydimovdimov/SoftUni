package P05Ex_While_Loop;

import java.util.Scanner;

public class P05_Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine()) * 100;
        int newSum = (int) (sum);
        int[] coinValue = {200, 100, 50, 20, 10, 5, 2, 1};
        int coins = 0, counter = 0;
        while (newSum > 0) {
            if (newSum >= coinValue[counter]) {
                coins += newSum / coinValue[counter];
                newSum = newSum % coinValue[counter];
            }
            counter++;
        }
        System.out.println(coins);
    }
}
