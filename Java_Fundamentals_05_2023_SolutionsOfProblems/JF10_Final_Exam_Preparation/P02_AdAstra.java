package JF10_Final_Exam_Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02_AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rgx = "([#|])(?<food>[A-Za-z ]+)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1";
        Pattern pattern = Pattern.compile(rgx);
        List<String> foodsList = new ArrayList<>();
        List<String> datesList = new ArrayList<>();
        List<Integer> caloriesList = new ArrayList<>();
        Matcher matcher = pattern.matcher(scanner.nextLine());

        while (matcher.find()) {
            foodsList.add(matcher.group("food"));
            datesList.add(matcher.group("date"));
            caloriesList.add(Integer.parseInt(matcher.group("calories")));
        }

        int totalCalories = 0;
        for (Integer cal : caloriesList) {
            totalCalories += cal;
        }

        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        for (int i = 0; i < foodsList.size(); i++) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",
                    foodsList.get(i), datesList.get(i), caloriesList.get(i));
        }
    }
}
