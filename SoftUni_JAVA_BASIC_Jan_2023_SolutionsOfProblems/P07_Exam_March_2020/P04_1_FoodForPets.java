package P07_Exam_March_2020;

import java.util.Scanner;

public class P04_1_FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double foodAmount = Double.parseDouble(scanner.nextLine());
        double biscuits = 0;
        int dogFood = 0, catFood = 0;
        for (int dayCount = 1; dayCount <= days; dayCount++) {
            int dogDayFood = Integer.parseInt(scanner.nextLine());
            int catDayFood = Integer.parseInt(scanner.nextLine());
            if (dayCount % 3 == 0) {
                biscuits += (dogDayFood + catDayFood) * 0.1;
            }
            dogFood += dogDayFood;
            catFood += catDayFood;
        }
        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", (dogFood + catFood) * 100 / foodAmount);
        System.out.printf("%.2f%% eaten from the dog.%n", dogFood * 100.0 / (dogFood + catFood));
        System.out.printf("%.2f%% eaten from the cat.%n", catFood * 100.0 / (dogFood + catFood));
    }
}
